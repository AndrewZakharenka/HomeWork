package HomeWork14102020.animals;

public class Mouse extends Rat{
    private String breed;

    public Mouse(String breed, String color) {
        this.breed = breed;
        super.color = color;
        super.alive = true;
    }

    public void run(){
        System.out.println("Mouse running");
    }
}
