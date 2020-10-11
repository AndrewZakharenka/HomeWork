package HomeWork14102020.animals;

public abstract class Feline implements Animals{
    protected String color;
    protected boolean alive;

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public boolean getAlive() {
        return alive;
    }

    @Override
    public void voice() {
        System.out.println("Miau...");
    }

}
