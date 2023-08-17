package homework_23;

public class Mouse {

    private String brand;
    private boolean isBluetooth;

    public Mouse(String brand, boolean isBluetooth) {
        this.brand = brand;
        this.isBluetooth = isBluetooth;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public boolean isBluetooth() {
        return isBluetooth;
    }

    public void setBluetooth(boolean bluetooth) {
        isBluetooth = bluetooth;
    }

    public String toString() {
        return "\nMouse brand: " + brand + "\nMouse is bluetooth: " + isBluetooth;
    }
}
