package lesson_29;

public class Truck extends Car{
    private final int maxWeight;
    private int currentWeight;
    private final int maxFuel;
    private int currentFuel;

    public Truck(String model, String manufacturer, int year,
                 String colour, int maxWeight, int maxFuel) {
        super(model, manufacturer, year, colour);
        this.maxWeight = maxWeight;
        this.maxFuel = maxFuel;
    }

    @Override
    public void move() {
        if (currentFuel == 0) {
            System.out.println("Not enough fuel");
            return;
        }
        if (currentWeight == 0) {
            System.out.println("Please load truck before driving!");
            return;
        }

        System.out.println("Trying...");
        System.out.println("Trying...");
        System.out.println("Trying...");
        System.out.println("Yeah, driving");
    }

    @Override
    public void stop() {
        System.out.println("Stopping...");
        System.out.println("Stopping...");
        System.out.println("Truck stopped");
    }

    public void load(int weight) {
        if (weight > getRemainingCapacity()){
            System.out.println("Its too heavy for me! I cant continue");
            printRemainingCapacity();
            return;
        }
        currentWeight += weight;

        System.out.println("Loading " + weight + " tons.....");
        System.out.println("Loaded " + weight + " tons");
        printRemainingCapacity();
    }

    public void setCurrentFuel(int currentFuel) {
        if (currentFuel <= maxFuel) {
            this.currentFuel = currentFuel;
        } else System.out.println("Fuel tank is only " + maxFuel + " litres");

    }

    public void unload(int unloadingWeight) {
        if (unloadingWeight > currentWeight) {
            System.out.println("Not enough cargo");
            printRemainingCargo();
            return;
        }
        if (unloadingWeight < 0) {
            System.out.println("I cant load negative weight");
            return;
        }
        currentWeight -= unloadingWeight;
        System.out.println("Unloading " + unloadingWeight + " tons.....");
        System.out.println("Unloaded " + unloadingWeight + " tons");
        printRemainingCargo();
    }

    private int getRemainingCapacity() {
        return  maxWeight - currentWeight;
    }

    private void printRemainingCargo() {
        System.out.println("Remaining cargo weight is " + currentWeight + " tons");
    }

    private void printRemainingCapacity() {
        System.out.println("Remaining capacity is " + getRemainingCapacity() + " tons");
    }
}
