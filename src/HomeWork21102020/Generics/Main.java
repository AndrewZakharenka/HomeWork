package HomeWork21102020.Generics;

public class Main {
    public static void main(String[] args) {
        ArrayAllTypes<String> arrayStr = new ArrayAllTypes<>(new String[]{"str1", "str2", "str3"});
        ArrayAllTypes<Integer> arrayInt = new ArrayAllTypes<>(new Integer[]{10, 20, 30});

        System.out.println(arrayStr.<String>getArrayByIndex(2));
        System.out.println(arrayInt.<Integer>getArrayByIndex(1));
    }
}
