package Operator_and_switch;

import java.util.Scanner;

public class Operator {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a, b, c, r;
        System.out.println("Input a: ");
        a = in.nextDouble();
        System.out.println("Input b: ");
        b = in.nextDouble();
        System.out.println("Input r: ");
        r = in.nextDouble();

        c = Math.pow(a, 2) + Math.pow(b, 2);
        c = Math.sqrt(c);

        if (c / 2 <= r) {
            System.out.println("You can close the rectangle");
        } else {
            System.out.println("You can't close the rectangle");
        }
        in.close();
    }
}
