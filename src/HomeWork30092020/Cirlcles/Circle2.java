package HomeWork30092020.Cirlcles;

public class Circle2 {
    public static void main(String[] args) {
        int countAmebs = 1;
        for (int i = 1; i <= 24; i++) {
            if (i % 3 == 0) {
                countAmebs *= 2;
                System.out.println("After " + i + " hours, the number of amoebas will be equal to: " + countAmebs);
            }
        }

    }
}
