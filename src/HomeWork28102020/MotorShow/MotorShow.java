package HomeWork28102020.MotorShow;

import HomeWork30092020.Array.Array;

import java.util.ArrayList;

public class MotorShow {
    ArrayList<Car> cars;

    public MotorShow() {
        this.cars = new ArrayList<>();
    }

    public ArrayList<Car> getCar() {
        return this.cars;
    }

    public Car getCar(int index) {
        return this.cars.get(index);
    }

    public void addCar(Car car) {
        this.cars.add(car);
    }

    public void removeCar(Car car) {
        this.cars.remove(car);
    }

    public void removeCar(int index) {
        this.cars.remove(index);
    }

}
