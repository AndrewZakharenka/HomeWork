package HomeWork04112020.Regular;

import java.util.regex.Pattern;

public class RegularIpAdres {
    public static void main(String[] args) {
        String text = "127.0.0.1";
        String regex = "^\\d{3}[.]\\d{1,3}[.]\\d{1,3}[.]\\d{1}";
        if (Pattern.matches(regex, text)){
            System.out.println("Выражение верно!");
        } else {
            System.out.println("Выражение неверно!");
        }
    }
}
