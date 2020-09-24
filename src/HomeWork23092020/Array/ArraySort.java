package HomeWork23092020.Array;

import java.util.Arrays;
import java.util.Random;

public class ArraySort {
    static Random random = new Random();

    public static void main(String[] args) {
        int max = 30, min = -30;
        int[] array = new int[15];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(max - min) + min;
        }
        System.out.println("Not sorted array: " + Arrays.toString(array));

        int temp;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println("Sorted array: " + Arrays.toString(array));
    }
}
