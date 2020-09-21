package Array;

public class Ragged_array {

    public static void main(String[] args) {
        Two_dimensional_array arr = new Two_dimensional_array();
        int[][] array = new int[7][];

        for (int i = 0; i < array.length; i++){
            array[i] = new int[arr.random.nextInt(arr.max - arr.min) + arr.min];
        }

        array = arr.fillArray(array);

        arr.printArray(array);
    }
}
