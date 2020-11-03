package HomeWork04112020.InvertedLine;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку: ");

        try (FileOutputStream fos = new FileOutputStream("F:/TeachMeSkills/HomeWork/Projects/src/HomeWork04112020/TestWrite.txt")) {
            StringBuilder str = new StringBuilder(in.nextLine());
            fos.write(str.reverse().toString().getBytes());

//            Сразу было интересено сделать с обычными строками
//            String str = in.nextLine();
//            for (int i = str.length() - 1; i >= 0; i--) {
//                fos.write((byte) str.charAt(i));
//                System.out.print(str.charAt(i));
//            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
