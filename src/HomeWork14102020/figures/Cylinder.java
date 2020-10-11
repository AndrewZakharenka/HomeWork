package HomeWork14102020.figures;

public class Cylinder extends SolidOfRevolution{
    private double height;

    public Cylinder(double height, double volume, double radius) {
        this.height = height;
        setVolume(volume);
        setRadius(radius);
    }
}
