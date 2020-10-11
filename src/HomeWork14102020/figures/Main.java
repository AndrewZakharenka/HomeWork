package HomeWork14102020.figures;

public class Main {
    public static void main(String[] args) {
        Shape ball = new Ball(10, 5);
        Shape cylinder = new Cylinder(12, 15, 6);
        Shape pyramid = new Pyramid(13, 10, 20);
        Box box = new Box(40);

        box.add(ball);
        box.add(cylinder);
        box.add(pyramid);
    }
}
