package HomeWork21102020.Timer;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Timer timer = new Timer(new Stopwatch());
        int time = 0;
        while(true){
            Thread.sleep(10 * 1000);
            timer.print(time += 10);
        }
    }
}
