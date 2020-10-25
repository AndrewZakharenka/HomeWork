package HomeWork28102020.MotorShow;

import java.util.Scanner;

public class Admin extends User {
    Scanner in = new Scanner(System.in);

    private void addCar(MotorShow motorShow, Car car) {
        motorShow.addCar(car);
    }

    public void choiceAdmin(MotorShow motorShow) {
        System.out.println("1 - Добавить машину. 2 - Получить весь список машин. 3 - Получить информацию по машине" +
                " 4 - Выйти");
        try {

            switch (in.nextInt()) {
                case (1):
                    String model;
                    String marka;
                    double price;
                    System.out.println("Введите модель автомобиля: ");
                    model = in.next();
                    System.out.println("Введите марку автомобиля: ");
                    marka = in.next();
                    System.out.println("Введите стоимость автомобиля: ");

                    try {
                        price = in.nextDouble();
                    } catch (java.lang.NumberFormatException e) {
                        System.out.println(e.getMessage());
                        System.out.println("ОШИБКА! Неверный формат введенной цены. Цена будет установлена 0.0");
                        price = 0.0;
                    }

                    addCar(motorShow, new Car(model, marka, price));
                    System.out.println("Автомобиль добавлен!");
                    choiceAdmin(motorShow);
                case (2):
                    printInfoAboutAllCars(motorShow);
                    choiceAdmin(motorShow);
                case (3):
                    System.out.println("Введите номер машины по которой необходимо вывести информацию: ");
                    printInfoAboutCar(motorShow, in.nextInt());
                    choiceAdmin(motorShow);
                case (4):
                    System.exit(0);
                default:
                    System.out.println("Выберите число от 1 до 4!");
                    choiceAdmin(motorShow);
            }
        } catch (java.util.InputMismatchException e) {
            System.out.println("Введены неверные параметры, необходимо выбрать от 1 до 4");
            in.next();
            choiceAdmin(motorShow);
        }
    }
}
