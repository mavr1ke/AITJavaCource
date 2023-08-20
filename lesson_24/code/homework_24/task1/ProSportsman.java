package homework_24.task1;

public class ProSportsman extends Human{
    public ProSportsman() {
        super();
    }

    @Override
    public void setDefaultValues() {
        setDistance(25);
        setRelaxTime(5);
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
