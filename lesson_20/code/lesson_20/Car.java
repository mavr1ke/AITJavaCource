package lesson_20;

public class Car {

    private String name;

    private int powerPS;
    static int carCount;

    public Car(String name, int powerPS) {
        this.name = name;
        this.powerPS = powerPS;
        carCount++;
    }

    public String getName() {
        return name;
    }

    public int getPowerPS() {
        return powerPS;
    }

    static void showStaticInfo() {
        System.out.println("Car count: " + carCount);
    }
}
