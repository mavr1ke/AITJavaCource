package homework_24.task2;

public class Bicycle extends Vehicle{
    public Bicycle(String name) {
        super(name);
    }

    @Override
    public void setDefaultValues() {
        //nothing
    }

    @Override
    public void setEngine(Engine engine) {
        System.out.println("I don't have space for an engine");
    }

    public String toString() {
        return "Bicycle " + getId() + ": name = " + getName();
    }
}
