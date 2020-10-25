package HomeWork28102020.Plants;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Map<String, String> plants = new HashMap<>();

        plants.put("Арбуз", "Ягода");
        plants.put("Огурец", "Овощ");
        plants.put("Апельсин", "Фрукт");

        printAllInfoAboutPlants(plants);

        System.out.println("Введите растение, по которому необходимо получить информацию: ");
        printInfoAboutPlants(plants, in.next());
    }

    private static void printInfoAboutPlants(Map plants, String plant) {
        if (plants.get(plant) != null) {
            System.out.println(plant + " - это " + plants.get(plant));
        } else {
            System.out.println("Такого растения нету в созданном списке!");
        }
    }

    private static void printAllInfoAboutPlants(Map<String, String> plants) {
        for (Map.Entry<String, String> plant : plants.entrySet()) {
            System.out.println(plant.getKey() + " - это " + plant.getValue());
        }
    }

}
