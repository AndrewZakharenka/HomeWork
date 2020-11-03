package HomeWork04112020.CatalogAndZIP;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class Main {
    public static void main(String[] args) {
        String path = "F:/TestHomeWork";
        try {
            File dir = new File(path);
            if (!dir.exists()) {
                if (dir.mkdir()) {
                    System.out.println("Каталог создан");
                } else {
                    System.out.println("Каталог не создан");
                }
            }

            Files.writeString(Paths.get(path + "/File1.txt"), "файл 1");
            Files.writeString(Paths.get(path + "/File2.txt"), "файл 2");
            Files.writeString(Paths.get(path + "/File3.txt"), "файл 3");

            try (ZipOutputStream zout = new ZipOutputStream(new FileOutputStream(path + "/archive.zip"))) {
                for (String file : dir.list()) {
                    FileInputStream fis = new FileInputStream(path + "/" + file);
                    zout.putNextEntry(new ZipEntry(file));
                    byte[] buffer = new byte[fis.available()];
                    fis.read(buffer);
                    zout.write(buffer);
                    fis.close();
                    zout.closeEntry();
                }
            }

            dir.renameTo(new File("F:/TestHomeWorkRenamed"));
            File dir2 = new File("F:/TestHomeWorkRenamed");
            System.out.println("Список файлов и каталогов: ");
            for (String file : dir2.list()) {
                System.out.println(file);
            }

            for (String file : dir2.list()) {
                File currentFile = new File(dir2.getPath(), file);
                currentFile.delete();
            }
            dir2.delete();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
