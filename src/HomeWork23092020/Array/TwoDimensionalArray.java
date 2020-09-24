package HomeWork23092020.Array;

import java.util.Random;
import java.util.Scanner;

public class TwoDimensionalArray {
    static Random random = new Random();
    static int max = 15, min = 0;

    public static void printArray(int[][] array) {
        System.out.println("Completed array: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] fillArray(int[][] array) {
        int max = 15, min = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++)
                array[i][j] = random.nextInt(max - min) + min;
        }
        return array;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int row, column;
        System.out.println("Enter the size of the array");
        System.out.print("Input n: ");
        row = in.nextInt();
        System.out.println();
        System.out.print("Input m: ");
        column = in.nextInt();
        System.out.println();

        int[][] array = new int[row][column];

        array = fillArray(array);

        printArray(array);

        System.out.println("Ready array: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] % 2 > 0) {
                    array[i][j] = 1;
                } else {
                    array[i][j] = 0;
                }
            }
        }
        printArray(array);

        in.close();
    }
}
