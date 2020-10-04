package HomeWork07102020.Computer;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Random;

public class Computer {
    private String typeProcessor;
    private int ram;
    private int hardDrive;

    //0 - выключен
    //1 - включен
    //-1 - сломан
    private int statusComputer;

    public Computer(String typeProcessor, int ram, int hardDrive) {
        this.typeProcessor = typeProcessor;
        this.ram = ram;
        this.hardDrive = hardDrive;
        this.statusComputer = 0;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "typeProcessor='" + typeProcessor + '\'' +
                ", ram=" + ram +
                ", hardDrive=" + hardDrive +
                '}';
    }

    public void startComputer(int number) {
        switch (this.statusComputer) {
            case (0):
                Random random = new Random();
                int numberRand = random.nextInt(2);

                if (number == numberRand) {
                    System.out.println("Computer started...");
                    this.statusComputer = 1;
                } else {
                    this.statusComputer = -1;
                    System.out.println("The computer burned down...");
                }
                break;
            case (1):
                System.out.println("The computer is already turned on! Please turn off your computer");
                break;
            case (-1):
                System.out.println("The computer burned down...");
                break;
        }
    }

    public void shutdownComputer(int number) {
        switch (this.statusComputer) {
            case (0):
                System.out.println("The computer is already turned off! Please turn on your computer");
                break;
            case (1):
                Random random = new Random();
                int numberRand = random.nextInt(2);

                if (number == numberRand) {
                    System.out.println("Computer go off...");
                    this.statusComputer = 1;
                } else {
                    this.statusComputer = -1;
                    System.out.println("The computer burned down...");
                }
                break;
            case (-1):
                System.out.println("The computer burned down...");
                break;
        }
    }
}
