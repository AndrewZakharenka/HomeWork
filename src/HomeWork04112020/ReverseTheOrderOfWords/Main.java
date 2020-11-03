package HomeWork04112020.ReverseTheOrderOfWords;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String str = null;
        try {
            str = new String(Files.readAllBytes(Paths.get("F:/TeachMeSkills/HomeWork/Projects/src/HomeWork04112020/Test.txt")));
        } catch (IOException e) {
            e.printStackTrace();
        }
        String[] words = str.split(" ");
        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i]);
            if (i != 0) {
                System.out.print(" ");
            }
        }
    }
}
