package homework_24.task2;

public class MainVehicle {
    public static void main(String[] args) {

        System.out.println("\n***Task 2***\n");
        Car car = new Car("BMW");
        Engine engine = new Engine("BMW-022", 220);
        car.setEngine(engine);

        Bicycle bicycle = new Bicycle("Stork");

        Motorcycle motorcycle = new Motorcycle("Yamaha");
        Engine engineYamaha = new Engine("YM-001", 100);
        motorcycle.setEngine(engineYamaha);


        Vehicle[] vehicles = new Vehicle[3];
        vehicles[0] = car;
        vehicles[1] = bicycle;
        vehicles[2] = motorcycle;

        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle);
            vehicle.startEngine();
            System.out.println();
        }

    }
}
