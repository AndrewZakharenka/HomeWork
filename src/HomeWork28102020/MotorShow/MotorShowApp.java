package HomeWork28102020.MotorShow;

import java.util.Scanner;

public class MotorShowApp {
    private static Scanner in = new Scanner(System.in);
    private static MotorShow motorShow;

    public static void main(String[] args) {
        motorShow = new MotorShow();
        motorShow.addCar(new Car("BMW", "M3", 40000));
        motorShow.addCar(new Car("AUDI", "A4", 25000));
        motorShow.addCar(new Car("KIA", "RIO", 15000));

        start();
    }

    private static void start() {
        System.out.println("Сделайте выбор. 1 - Войти, как администратор. 2 - Войти, как покупатель. 3 - Выйти");
        try {
            switch (in.nextInt()) {
                case (1):
                    Admin admin = new Admin();
                    admin.choiceAdmin(motorShow);
                    break;
                case (2):
                    Client client = new Client();
                    client.choiceCLient(motorShow);
                    break;
                case (3):
                    System.exit(0);
                default:
                    System.out.println("Выбрать можно только от 1 до 3, попробуйте еще раз");
                    start();
            }
        } catch (java.util.InputMismatchException e) {
            System.out.println("Введены неверные параметры, необходимо выбрать 1 или 2");
            //добавляю считывание строки, для того, чтобы не войти в бесконечный цикл, но не понимаю, почему сканер при возникновении ошибки считывает предыдущий ввод...
            in.next();
            start();
        }
    }


}
