package homework_22;

public class Phone extends Device {

    private boolean isSensor;
    private byte cameraResolution;

    public Phone(String model, float price, boolean isSensor, byte cameraResolution) {
        super(model, price);
        setSensor(isSensor);
        setCameraResolution(cameraResolution);
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

    public void takeAPhoto() {
        System.out.println("*Flash-click*");
    }
}
