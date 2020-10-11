package HomeWork14102020.animals;

public class Cat extends Feline{
    private String breed;

    public Cat(String breed, String color) {
        this.breed = breed;
        super.alive = true;
        super.color = color;
    }

    public void eat(Rat rat){
        if (rat.getAlive()){
            rat.setAlive(false);
            System.out.println("Mouse eaten by cat");
        } else{
            System.out.println("The mouse was already eaten");
        }

    }

    public void run(){
        System.out.println("Cat running");
    }
}
