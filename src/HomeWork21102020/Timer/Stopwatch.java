package HomeWork21102020.Timer;

public class Stopwatch implements ITimer{

    @Override
    public void printTime(Integer time) {
        System.out.println("Прошло " + time + " секунд");
    }
}
