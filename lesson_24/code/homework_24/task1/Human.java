package homework_24.task1;

public class Human {

    private int distance;
    private int relaxTime;

    public Human() {
        setDefaultValues();
    }

    public void setDefaultValues() {
        setDistance(10);
        setRelaxTime(15);
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public int getRelaxTime() {
        return relaxTime;
    }

    public void setRelaxTime(int relaxTime) {
        this.relaxTime = relaxTime;
    }

    public void run() {
        System.out.println("I run " + distance + " km");
        relaxAfterRun();
    }

    public void relaxAfterRun() {
        System.out.println("I need to relax for " + relaxTime + " min\n");
    }
}
