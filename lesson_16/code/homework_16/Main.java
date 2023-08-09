package homework_16;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n***Task 0***\n");
        Printer printerEpson = new Printer("Laser", "Epson", 100);
        System.out.println("Printer type: " + printerEpson.type);
        System.out.println("Printer brand: " + printerEpson.brand);
        System.out.println("Printer price: " + printerEpson.price);
        printerEpson.print();
        printerEpson.scan();
        Cloth clothPants = new Cloth("Pants", "Palm Angels", (byte) 33, "black");
        System.out.println("\nCloth type: " + clothPants.type);
        System.out.println("Cloth brand: " + clothPants.brand);
        System.out.println("Cloth size: " + clothPants.size);
        System.out.println("Cloth color: " + clothPants.color);
        Internet internetTelecom = new Internet("Wi-fi", "Telecom", (short) 200);
        System.out.println("\nInternet type: " + internetTelecom.type);
        System.out.println("Internet provider: " + internetTelecom.provider);
        System.out.println("Internet speed: " + internetTelecom.speed);
    }
}
