package homework_23;

public class HWMain {
    public static void main(String[] args) {

        System.out.println("\n***Task 0***\n");
        System.out.println("DEVICES");
        Device device = new Device("Model example", 11.11F);
        System.out.println("Device example:" + device);

        System.out.println("\nLaptop:");
        Mouse mouse = new Mouse("Logitech", false);
        Laptop laptop = new Laptop("Rog Strix 13", 1199.99F, "nvidia 2060 gtx", false, mouse);
        System.out.println(laptop);
        laptop.turnOn();
        laptop.coding();
        laptop.turnOff();

        System.out.println("\nPhone:");
        Charger charger = new Charger("TypeC", false);
        Phone phone = new Phone("Galaxy s20", 119.99F, true, (byte) 50, charger);
        System.out.println(phone);
        phone.turnOn();
        phone.takeAPhoto();
        phone.turnOff();

        System.out.println("\nHOME ANIMALS");
        HomeAnimal homeAnimal = new HomeAnimal("Animal name", (byte) 0);
        System.out.println("Home animal example:" + homeAnimal);

        System.out.println("\nCat:");
        Collar collar = new Collar("Black", "Leather");
        Cat cat = new Cat("Felix", (byte) 1, true, false, collar);
        System.out.println(cat);
        cat.feed();
        cat.pet();
        cat.meow();

        System.out.println("\nParrot:");
        Cage cage = new Cage((short) 100, (short) 100);
        Parrot parrot = new Parrot("Max", (byte) 2, "blue", "cockatiel", cage);
        System.out.println(parrot + "\nColor: " + parrot.getColor());
        System.out.println("Type: " + parrot.getType());
        parrot.feed();
        parrot.pet();
        parrot.repeating("Hello");

    }
}
