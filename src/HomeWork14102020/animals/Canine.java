package HomeWork14102020.animals;

public abstract class Canine implements Animals{
    protected String color;
    protected boolean alive;

    @Override
    public void voice() {
        System.out.println("Gav gav gav...");
    }


}
