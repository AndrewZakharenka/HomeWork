package HomeWork14102020.figures;

public class Pyramid extends Shape{
    private double s;
    private double h;

    public Pyramid(double s, double h, double volume) {
        setVolume(volume);
        this.s = s;
        this.h = h;
    }
}
