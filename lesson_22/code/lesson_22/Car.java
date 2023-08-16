package lesson_22;

public class Car extends Vehicle{

    private int mileage;
    public Car(String model, int yearOfManufacture) {
        super(model, yearOfManufacture);
    }

    public int getMileage() {
        return mileage;
    }

    public void goToRoute(int routeLength) {
        System.out.println("Im starting a ride for route");
        gas();
        // code
        breaking();
        mileage += routeLength;
    }
}
