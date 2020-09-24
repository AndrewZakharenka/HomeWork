package HomeWork23092020.Array;

import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n, sum = 0, pr = 1, min, max, min_i = 0, max_i = 0;
        System.out.println("Input n: ");
        n = in.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Input arr[" + i + "]: ");
            arr[i] = in.nextInt();
        }

        min = arr[0];
        max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                sum += arr[i];
            }

            if (arr[i] < min) {
                min = arr[i];
                min_i = i;
            } else {
                if (arr[i] > max) {
                    max = arr[i];
                    max_i = i;
                }
            }
        }

        for (int i = min_i + 1; i < max_i; i++) {
            pr *= arr[i];
        }

        System.out.println("Summ element = " + sum);
        System.out.println("Multiplication element = " + pr);
        in.close();
    }
}
