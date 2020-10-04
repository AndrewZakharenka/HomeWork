package HomeWork07102020.Computer;

import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Computer computer1 = new Computer("AMD", 8, 500);
        consoleRead(computer1);
    }

    public static boolean consoleRead(Computer computer) {
        System.out.println("Selected action: \n 1 - Started computer \n 2 - Off the computer \n 3 - Exit");
        int chooseAction = in.nextInt();
        int chooseNum;
        switch (chooseAction) {
            case (1):
                System.out.println("Choose 0 or 1");
                chooseNum = in.nextInt();
                computer.startComputer(chooseNum);
                return consoleRead(computer);
            case (2):
                System.out.println("Choose 0 or 1");
                chooseNum = in.nextInt();
                computer.shutdownComputer(chooseNum);
                return consoleRead(computer);
            case (3):
                System.out.println("Happy end =)");
                return true;
            default:
                return consoleRead(computer);
        }
    }
}
