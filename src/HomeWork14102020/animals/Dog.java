package HomeWork14102020.animals;

public class Dog extends Canine{
    private String breed;

    public Dog(String breed, String color) {
        this.breed = breed;
        super.color = color;
        super.alive = true;
    }

    public void eat(Feline feline) {
        if (feline.getAlive()){
            feline.setAlive(false);
            System.out.println("Cat eaten by dog");
        } else{
            System.out.println("The cat was already eaten");
        }

    }

    public void eat(Rat rat) {
        if (rat.getAlive()){
            rat.setAlive(false);
            System.out.println("Mouse eaten by dog");
        } else{
            System.out.println("The mouse was already eaten");
        }

    }

    public void run(){
        System.out.println("Dog running");
    }
}
