package homework_24.task1;

public class ProSportsman extends Human{
    public ProSportsman() {
        relaxTime = 5;
    }

    @Override
    public void run() {
        System.out.println("I run 25 km");
        relaxAfterRun();
    }
}
