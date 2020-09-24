package HomeWork23092020.Array;

public class RaggedArray {

    public static void main(String[] args) {
        TwoDimensionalArray arr = new TwoDimensionalArray();
        int[][] array = new int[7][];

        for (int i = 0; i < array.length; i++){
            array[i] = new int[arr.random.nextInt(arr.max - arr.min) + arr.min];
        }

        array = arr.fillArray(array);

        arr.printArray(array);
    }
}
