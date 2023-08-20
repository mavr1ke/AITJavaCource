package homework_24.task2;

public class Vehicle {

    private String name;
    private Engine engine;
    private final int id;
    private static int idCounter;

    public Vehicle(String name) {
        this.name = name;
        this.id = idCounter++;
        setDefaultValues();
    }

    public void setDefaultValues(){
        this.engine = new Engine();
    }

    public void startEngine(){
        if (engine == null) {
            System.out.println("Error 404 engine in not found");
        } else {
            engine.start();
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public int getId() {
        return id;
    }

    public String toString() {
        return "Vehicle " + id + ": name = " + name + ", engine = " + engine;
    }
}
