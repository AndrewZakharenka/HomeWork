package HomeWork28102020.MapAndSet;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        Set<Integer> set = new HashSet<>();
        ArrayList<String> list = new ArrayList<>();

        map.put(1, "Первый");
        map.put(2, "Второй");
        map.put(3, "Третий");
        map.put(4, "Четвертый");
        map.put(5, "Пятый");

        System.out.println("Map: " + map.toString());

        for (Map.Entry<Integer, String> item : map.entrySet()) {
            set.add(item.getKey());
            list.add(item.getValue());
        }

        System.out.println("Ключи: " + set.toString());
        System.out.println("Значения: " + list.toString());
    }
}
