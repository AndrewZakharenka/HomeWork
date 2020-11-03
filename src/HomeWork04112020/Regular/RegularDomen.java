package HomeWork04112020.Regular;

import java.util.regex.Pattern;

public class RegularDomen {
    public static void main(String[] args) {
        String text = "http://example.com";
        String regex = "^(https|http):\\/\\/\\w*[.]\\w*\\/";

        if (Pattern.matches(regex, text)){
            System.out.println("Формат домена верен!");
        } else {
            System.out.println("Формат домена неверный!");
        }
    }
}
