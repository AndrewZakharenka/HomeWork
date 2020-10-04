package HomeWork07102020.Calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Calculator operands = new Calculator();

        System.out.println("Input first number: ");
        operands.setFirstNumber(in.nextInt());
        System.out.println("Input second number: ");
        operands.setSecondNumber(in.nextInt());

        operands.sub();
        operands.sum();
        operands.multiplication();
    }

}
