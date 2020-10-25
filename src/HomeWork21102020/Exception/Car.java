package HomeWork21102020.Exception;

import java.util.Random;

public class Car {
    private String mark;
    private double speed;
    private double price;

    public Car(String mark, double speed, double price) {
        this.mark = mark;
        this.speed = speed;
        this.price = price;
    }

    public Car() {
        this.mark = "unknown";
        this.speed = 0.0;
        this.price = 0.0;
    }

    public String getMark() {
        return mark;
    }

    public double getSpeed() {
        return speed;
    }

    public double getPrice() {
        return price;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void start() throws CarIsNotEngineStartException {
        Random random = new Random();
        int randomNumber = random.nextInt(20) + 1;

        if (randomNumber % 2 == 0) {
            throw new CarIsNotEngineStartException("Машина " + this.mark + " не завелась!!!");
        } else {
            System.out.println("Ура!!! Машина " + this.mark + " завелась !");
        }
    }
}
