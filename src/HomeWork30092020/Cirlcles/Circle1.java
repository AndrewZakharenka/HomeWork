package HomeWork30092020.Cirlcles;

public class Circle1 {
    public static void main(String[] args) {
        double dist = 10, allDist = dist;
        System.out.println("Journey in 1 days: " + dist + " kilometers");
        for (int i = 1; i < 7; i++) {
            dist += dist * 0.1;
            System.out.println("Journey in " + (i + 1) + " day: " + dist + " kilometers");
            allDist += dist;
        }
        System.out.println("Сomplete journey in 7 days: " + allDist + " kilometers");
    }
}
