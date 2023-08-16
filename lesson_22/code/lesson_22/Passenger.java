package lesson_22;

public class Passenger extends Person {
    static private int counter;
    private int id;

    public Passenger(String name) {
        super(name);
        this.id = counter++;
    }

    public int getId() {
        return id;
    }

    public String toString() {
        return "{Passenger id: " + id + "; name: " + getName() + "}";
    }
}
