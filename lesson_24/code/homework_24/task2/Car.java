package homework_24.task2;

public class Car extends Vehicle{
    public Car(String name) {
        super(name);
    }

    public String toString() {
        return "Car " + getId() + ": name = " + getName() + ", engine = " + getEngine();
    }
}
