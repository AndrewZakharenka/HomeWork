package HomeWork14102020.figures;

public class Box extends Shape{

    public Box(double volume) {
        setVolume(volume);
    }

    public boolean add(Shape shape){
        if (getVolume() - shape.getVolume() < 0){
            System.out.println("The object doesn't fit in the container");
            return false;
        } else{
            setVolume(getVolume() - shape.getVolume());
            System.out.println("Object added to the container");
            return true;
        }
    }
}
