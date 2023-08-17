package homework_23;

public class Device {

    private String model;
    private float price;
    private final int id;
    static private int idCounter;

    public Device(String model, float price) {
        this.model = model;
        this.price = price;
        this.id = idCounter++;
    }

    public int getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String toString() {
        return "id: " + id + "\nmodel: " + model + "\nprice of: " + price + "$";
    }

    public void turnOn() {
        System.out.println("I'm on");
    }

    public void turnOff() {
        System.out.println("I'm off");
    }
}
