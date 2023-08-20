package homework_24.task1;

public class AmateurSportsman extends Human {

    public AmateurSportsman() {
        relaxTime = 10;
    }

    @Override
    public void run() {
        System.out.println("I ran 15 km");
        relaxAfterRun();
    }
}
