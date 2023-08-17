package homework_23;

public class Bus {

    private final int id;
    private String model;
    private int capacity;
    static private int idCounter;
    private BusDriver driver;
    private final AutoPilotBus autoPilotBus;

    public Bus(String model, int capacity) {
        this.model = model;
        this.capacity = capacity;
        this.id = idCounter++;
        this.autoPilotBus = new AutoPilotBus("AP-001", this);
    }

    public Bus(String model, int capacity, BusDriver driver) {
        this(model, capacity);
        this.driver = driver;
    }

    public String getAutoPilotBusInfo() {
        return autoPilotBus.toString();
    }

    public BusDriver getDriver() {
        return driver;
    }

    public void setDriver(BusDriver driver) {
        this.driver = driver;
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

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public static int getIdCounter() {
        return idCounter;
    }

    public static void setIdCounter(int idCounter) {
        Bus.idCounter = idCounter;
    }

    public String toString() {
        return "{id: " + id + "; model: " + model +
                "; driver: " + (driver == null ? "no driver" : driver.toString())
                + " autopilot: " + autoPilotBus.toString() + "}";
    }

    public void moveByDriver() {
        if (autoPilotBus.isActive()) {
            autoPilotBus.turnOff();
        }
        driver.driveBus(this);
    }

    public void moveByAutopilot() {
        autoPilotBus.driveBus();
    }
}
