package homework_24.task2;

public class Engine {
    private String model;
    private int power;
    private final int id;
    private static int idCounter;

    public Engine() {
        this.id = idCounter++;
        setDefaultValues();
    }

    public void setDefaultValues() {
        model = "f909";
        power = 222;
    }

    public Engine(String model, int power) {
        this();
        this.model = model;
        this.power = power;
    }

    public void start() {
        System.out.println("Engine " + id + " starts");
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getId() {
        return id;
    }

    public String toString() {
        return "Engine " + id + ": name = " + model + ", engine = " + power;
    }
}
