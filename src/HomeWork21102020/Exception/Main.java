package HomeWork21102020.Exception;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Mazda", 200.0, 12000.0);
        Car car2 = new Car("BMW", 300.0, 80000.0);
        Car car3 = new Car("KIA", 180.0, 13000.0);

        try {
            car1.start();
            car2.start();
            car3.start();
        } catch (CarIsNotEngineStartException e) {
            e.printStackTrace();
        }
    }
}
