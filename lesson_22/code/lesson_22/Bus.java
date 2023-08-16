package lesson_22;

public class Bus extends Car{

    private int capacity;
    private int countPassenger;

    public Bus(String model, int yearOfManufacture,int capacity) {
        super(model, yearOfManufacture);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getCountPassenger() {
        return countPassenger;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void takePassenger() {
        System.out.println("A passenger walked onto the bus");
        countPassenger++;
    }

    public void dropPassenger() {
        System.out.println("A passenger off the bus");
        countPassenger--;
        if (countPassenger < 0) countPassenger = 0;
    }
}
