package HomeWork30092020.Array;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Array {
    static Random random = new Random();
    static Scanner in = new Scanner(System.in);

    public static int getSizeArray() {
        int n = in.nextInt();
        if (n <= 3) {
            System.out.println("Invalid n! n must be greater than 3. Enter n: ");
            return getSizeArray();
        } else {
            return n;
        }
    }

    public static void printArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args) {
        int n, minRand = 0, maxRand, sizeArrSecond = 0;
        System.out.println("Input size array(n > 3): ");
        n = getSizeArray();
        maxRand = n;

        int[] arrayFirst = new int[n];
        for (int i = 0; i < arrayFirst.length; i++) {
            arrayFirst[i] = random.nextInt(maxRand - minRand) + minRand;
            if (arrayFirst[i] % 2 == 0 && arrayFirst[i] != 0) {
                sizeArrSecond++;
            }
        }

        printArray(arrayFirst);

        int[] arraySecond = new int[sizeArrSecond];
        int indexArrSecond = 0;
        for (int i = 0; i < arrayFirst.length; i++) {
            if (arrayFirst[i] % 2 == 0 && arrayFirst[i] != 0) {
                arraySecond[indexArrSecond] = arrayFirst[i];
                indexArrSecond++;
            }
        }
        printArray(arraySecond);
    }
}
