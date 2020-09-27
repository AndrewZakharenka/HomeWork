package HomeWork30092020.Recursion;

import java.util.Random;
import java.util.Scanner;

/*Честно говоря циклом сделал бы более рациональное решение, но по условию задачи надо сделать рекурсией
* Иного решения в голову не пришло, буду рад посмотреть, как можно было сделать иначе и попроще:)*/
public class Recursion {
    static Random random = new Random();
    static Scanner in = new Scanner(System.in);
    static boolean check;

    public static int getSizeArray() {
        int n = in.nextInt();
        if (n <= 1) {
            System.out.println("Invalid n! n must be greater than 1. Enter n: ");
            return getSizeArray();
        } else {
            return n;
        }
    }

    public static void printResult(int n, boolean simple) {
        if (simple == true) {
            System.out.printf("Is number %d simple - YES", n);
        } else {
            System.out.printf("Is number %d simple - NO", n);
        }
    }

    public static boolean verifyNumber(int iter, int n) {
        if (n <= 3) {
            return check = true;
        }

        if (n % iter == 0){
            return check = false;
        } else {
            check = true;
        }

        if (iter == 9) {
            return check;
        }else {
            return verifyNumber(++iter, n);
        }
    }

    public static void main(String[] args) {
        int iter = 2;
        System.out.println("Enter n > 1: ");
        int n = getSizeArray();
        printResult(n, verifyNumber(iter, n));

    }
}
