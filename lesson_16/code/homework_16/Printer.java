package homework_16;

public class Printer {
    String type;
    String brand;
    double price;
    public Printer(String printerType, String printerBrand, double printerPrice) {
        this.type = printerType;
        this.brand = printerBrand;
        this.price = printerPrice;
    }
    void print() {
        System.out.println("printing");
    }
    void scan() {
        System.out.println("scanning");
    }
}

