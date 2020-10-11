package HomeWork14102020.animals;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Siberian", "Black and white");
        Dog dog = new Dog("Labrador", "White");
        Mouse mouse = new Mouse("Small", "Gray");

        mouse.run();
        mouse.voice();

        cat.run();
        cat.voice();
        cat.eat(mouse);

        dog.run();
        dog.voice();
        dog.eat(cat);
        dog.eat(mouse);
    }
}
