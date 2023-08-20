package homework_24.task1;

public class Human {

    protected int relaxTime = 15;

    public void run() {
        System.out.println("I run 10 km");
        relaxAfterRun();
    }

    public void relaxAfterRun() {
        System.out.println("I need to relax for " + relaxTime + " min\n");
    }
}
