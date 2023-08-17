package lesson_and_hw_23_part_2;

public class Main23 {
    public static void main(String[] args) {

        System.out.println("\n***Task 0***\n");
        Bus bus = new Bus("Sprinter", 20);
        System.out.println(bus);

        BusDriver busDriver = new BusDriver("Bob", 35);
        System.out.println(busDriver);

        bus.setDriver(busDriver);
        System.out.println(bus);

        BusDriver busDriver1 = new BusDriver("John", 28);
        Bus bus1 = new Bus("Vilo", 12,busDriver1);
//        System.out.println(bus1);
//        bus1.setDriver(busDriver);
        System.out.println(bus1);

        bus.moveByDriver();
        bus1.moveByDriver();

        System.out.println(bus.getAutoPilotBusInfo());
        bus.moveByAutopilot();
        bus.moveByDriver();

        System.out.println("\n***Task 2***\n");
        busDriver.removeCategory("D");
        busDriver.removeCategory("B");
        System.out.println(busDriver.addCategory("D"));
        System.out.println(busDriver.addCategory(""));
        System.out.println(busDriver.addCategory("B"));
        System.out.println(busDriver);
        System.out.println(bus);
    }
}
