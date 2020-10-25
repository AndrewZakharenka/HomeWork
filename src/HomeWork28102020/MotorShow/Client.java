package HomeWork28102020.MotorShow;

import java.util.ArrayList;
import java.util.Scanner;

public class Client extends User {
    Scanner in = new Scanner(System.in);
    private ArrayList<Car> purchaseCars;

    public Client() {
        this.purchaseCars = new ArrayList<>();
    }

    public void buyCar(MotorShow motorShow, int index) {
        this.purchaseCars.add(motorShow.getCar(index));
        motorShow.removeCar(index);
        System.out.println("Поздравляем, машина приобретена и отправляется к вам!");
    }

    public ArrayList<Car> getPurchaseCar() {
        return purchaseCars;
    }

    public void choiceCLient(MotorShow motorShow) {
        System.out.println("1 - Купить машину. 2 - Получить весь список машин. 3 - Получить информацию по машине" +
                " 4 - Выйти");
        try {
            switch (in.nextInt()) {
                case (1):
                    System.out.println("Выберите автомобиль, который желаете приобрести: ");
                    buyCar(motorShow, in.nextInt());
                    choiceCLient(motorShow);
                case (2):
                    printInfoAboutAllCars(motorShow);
                    choiceCLient(motorShow);
                case (3):
                    System.out.println("Введите номер машины по которой необходимо вывести информацию: ");
                    printInfoAboutCar(motorShow, in.nextInt());
                    choiceCLient(motorShow);
                case (4):
                    System.exit(0);
                default:
                    System.out.println("Выберите число от 1 до 4!");
                    choiceCLient(motorShow);
            }
        } catch (java.util.InputMismatchException e) {
            System.out.println("Введены неверные параметры, необходимо выбрать от 1 до 4");
            in.next();
            choiceCLient(motorShow);
        }
    }

    @Override
    public String toString() {
        return "Client{" +
                "purchaseCars=" + purchaseCars +
                '}';
    }
}
