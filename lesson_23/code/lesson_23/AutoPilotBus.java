package lesson_23;

public class AutoPilotBus {

    private final int id;
    private String model;
    private boolean isActive;
    private final Bus bus;
    static int counter;

    public AutoPilotBus(String model, Bus bus) {
        this.model = model;
        this.bus = bus;
        this.id = counter++;
    }

    public int getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public Bus getBus() {
        return bus;
    }

    public void driveBus() {
        turnOn();
        System.out.println("Autopilot id:" + id
                + " is driving bus id:" + bus.getId() + " " + bus.getModel());
    }

    public void turnOff() {
        isActive = false;
        System.out.println("Autopilot " + id + " is off");
    }
    public void turnOn() {
        isActive = true;
        System.out.println("Autopilot " + id + " is on");
    }

    public String toString() {
        return "{id:" + id + "; model: " + model
                + " is in the bus with id:" + bus.getId() + "}";
    }
}
