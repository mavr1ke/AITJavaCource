package homework_23;

public class Phone extends Device {

    private boolean isSensor;
    private byte cameraResolution;
    private Charger charger;

    public Phone(String model, float price, boolean isSensor, byte cameraResolution, Charger charger) {
        super(model, price);
        this.isSensor = isSensor;
        this.cameraResolution = cameraResolution;
        this.charger = charger;
    }

    public Charger getCharger() {
        return charger;
    }

    public void setCharger(Charger charger) {
        this.charger = charger;
    }

    public boolean isSensor() {
        return isSensor;
    }

    public void setSensor(boolean sensor) {
        isSensor = sensor;
    }

    public byte getCameraResolution() {
        return cameraResolution;
    }

    public void setCameraResolution(byte cameraResolution) {
        this.cameraResolution = cameraResolution;
    }

    public String toString() {
        return super.toString() + "\nIs sensor: " + isSensor + "\nCamera resolution: " + cameraResolution + charger.toString();
    }

    public void takeAPhoto() {
        System.out.println("*Flash-click*");
    }
}
