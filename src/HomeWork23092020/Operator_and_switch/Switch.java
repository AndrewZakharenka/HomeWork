package HomeWork23092020.Operator_and_switch;

import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;

        System.out.println("Input n: ");
        n = in.nextInt();

        if (n >= 10) {
            System.out.println("Error! n must be less than 10");
            return;
        }
        if (n > 7) {
            System.out.println("There is no such day of the week");
            return;
        }
        switch (n) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }
        in.close();
    }
}
