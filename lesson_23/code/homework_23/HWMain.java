package homework_23;

public class HWMain {
    public static void main(String[] args) {

        Bus bus = new Bus("Sprinter", 20);
        System.out.println(bus);
        BusDriver busDriver = new BusDriver("Bob", 35);
        System.out.println(busDriver);

        bus.setDriver(busDriver);
        System.out.println(bus);

        BusDriver busDriver1 = new BusDriver("John", 28);
        Bus bus1 = new Bus("Vilo", 12,busDriver1);
        System.out.println(bus1);

        bus.moveByDriver();
        bus1.moveByDriver();

        System.out.println(bus.getAutoPilotBusInfo());
        bus.moveByAutopilot();
        bus.moveByDriver();
    }


}
