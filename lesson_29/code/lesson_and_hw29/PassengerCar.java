package lesson_and_hw29;

public class PassengerCar extends Car{
    public PassengerCar(String model, String manufacturer, int year, String colour) {
        super(model, manufacturer, year, colour);
    }

    @Override
    public void move() {
        System.out.println("Im driving");
    }

    @Override
    public void stop() {
        System.out.println("Im stopping");
    }

    @Override
    public String toString() {
        return "PassengerCar{} " + super.toString();
    }
}
