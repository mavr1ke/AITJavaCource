package homework_24.task2;

public class Motorcycle extends Vehicle{
    public Motorcycle(String name) {
        super(name);
    }

    public String toString() {
        return "Motorcycle " + getId() + ": name = " + getName() + ", engine = " + getEngine();
    }
}
