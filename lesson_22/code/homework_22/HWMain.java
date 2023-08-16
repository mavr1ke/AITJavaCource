package homework_22;

public class HWMain {
    public static void main(String[] args) {

        System.out.println("\n***Task 0***\n");
        System.out.println("DEVICES");
        Device device = new Device("Model example",11.11F);
        System.out.println("Device example:" + device);

        System.out.println("\nLaptop:");
        Laptop laptop = new Laptop("Rog Strix 13", 1199.99F, "nvidia 2060 gtx", false);
        System.out.println(laptop + "\nGraphic card: " + laptop.getGraphicCard());
        System.out.println("Is have disk drive: " + laptop.isDiskDrive());
        laptop.turnOn();
        laptop.coding();
        laptop.turnOff();

        System.out.println("\nPhone:");
        Phone phone = new Phone("Galaxy s20", 119.99F, true, (byte) 50);
        System.out.println(phone + "\nIs sensor: " + phone.isSensor());
        System.out.println("Camera resolution: " + phone.getCameraResolution());
        phone.turnOn();
        phone.takeAPhoto();
        phone.turnOff();

        System.out.println("\nHOME ANIMALS");
        HomeAnimal homeAnimal = new HomeAnimal("Animal name", (byte) 0);
        System.out.println("Home animal example:" + homeAnimal);

        System.out.println("\nCat:");
        Cat cat = new Cat("Felix", (byte) 1, true,false);
        System.out.println(cat + "\nIs woolen: " + cat.isWoolen());
        System.out.println("Is lazy: " + cat.isLazy());
        cat.feed();
        cat.pet();
        cat.meow();

        System.out.println("\nParrot:");
        Parrot parrot = new Parrot("Max", (byte) 2, "blue", "cockatiel");
        System.out.println(parrot + "\nColor: " + parrot.getColor());
        System.out.println("Type: " + parrot.getType());
        parrot.feed();
        parrot.pet();
        parrot.repeating("Hello");

    }
}
