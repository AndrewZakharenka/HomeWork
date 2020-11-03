package HomeWork04112020.MaxByteAndMinByte;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите название файла: ");
        try (FileInputStream fis = new FileInputStream("F:/TeachMeSkills/HomeWork/Projects/src/HomeWork04112020/" + in.nextLine())){
            byte[] buffer = new byte[fis.available()];
            fis.read(buffer, 0 ,fis.available());

            System.out.println("Max byte: " + (char)buffer[buffer.length-1]);

            System.out.println("Min byte: " + (char)buffer[0]);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
