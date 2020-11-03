package HomeWork04112020.Regular;

import java.util.Scanner;
import java.util.regex.Pattern;

public class RegularData {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String regex = "^\\d{4}\\/\\d{2}\\/\\d{2}\\s\\d{2}\\:\\d{2}\\:\\d{2}";

        System.out.println("Введите дату: ");
        if (Pattern.matches(regex, in.nextLine())){
            System.out.println("Формат даты верен!");
        } else {
            System.out.println("Формат даты неверный!");
        }
    }
}
