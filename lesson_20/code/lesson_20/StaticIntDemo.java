package lesson_20;

public class StaticIntDemo {

    public String[] strings;
    static Car[] cars;

    static {
        cars = new Car[3];
    }

    static {
        Car car = new Car("BMW", 200);
        Car car1 = new Car("Seat", 300);
        Car car2 = new Car("Skoda", 150);
        cars[0] = car1;
        cars[1] = car;
        cars[2] = car2;

    }

    {
        strings = new String[2];
        strings[0] = "";
        strings[1] = " ";
    }

    public StaticIntDemo() {
    }

    public void showAllCars() {
        System.out.println("Car amount: " + cars.length);
        int carsCount = 0;
        System.out.print("[");
        for (Car carCurrent : cars) {
            System.out.print(carCurrent.getName() + ": " + carCurrent.getPowerPS() + ((cars.length == carsCount + 1) ? "" : ", "));
            carsCount++;
        }
        System.out.print("]");
    }

    public static void main(String[] args) {
        StaticIntDemo staticIntDemo = new StaticIntDemo();
        staticIntDemo.showAllCars();
    }
}

