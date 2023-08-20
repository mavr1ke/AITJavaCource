package homework_24.task1;

public class AmateurSportsman extends Human {

    public AmateurSportsman() {
        super();
    }

    @Override
    public void setDefaultValues() {
        setDistance(15);
        setRelaxTime(10);
    }

    @Override
    public void run() {
        System.out.println("I ran " + getDistance() + " km");
        relaxAfterRun();
    }

    @Override
    public void relaxAfterRun() {
        System.out.println("I need to relax for " + getRelaxTime() + " min\n");
    }
}
