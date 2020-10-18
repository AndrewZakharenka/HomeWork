package HomeWork21102020.Timer;

public class Timer {
    ITimer timer;

    public Timer(ITimer timer) {
        this.timer = timer;
    }

    public void print(Integer time){
        timer.printTime(time);
    }

}
