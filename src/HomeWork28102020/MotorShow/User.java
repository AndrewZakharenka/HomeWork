package HomeWork28102020.MotorShow;

public abstract class User {

    void printInfoAboutAllCars(MotorShow motorShow) {
        if (motorShow.getCar().isEmpty()) {
            System.out.println("В салоне нет автомобилей!");
        } else {
            int i = 1;
            for (Car car : motorShow.getCar()) {
                System.out.println(i + " - " + car.toString());
                i++;
            }
        }
    }

    void printInfoAboutCar(MotorShow motorShow, int index) {
        try {
            System.out.println(motorShow.getCar(index - 1).toString());
        } catch (java.lang.IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
            System.out.println("Машин в автосалоне нет");
        }
    }
}
