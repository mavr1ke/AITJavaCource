package homework_23;

public class Laptop extends Device {

    private String graphicCard;
    private boolean diskDrive;

    private Mouse externalMouse;

    public Laptop(String model, float price, String graphicCard, boolean diskDrive, Mouse externalMouse) {
        super(model, price);
        this.graphicCard = graphicCard;
        this.diskDrive = diskDrive;
        this.externalMouse = externalMouse;
    }

    public Mouse getExternalMouse() {
        return externalMouse;
    }

    public void setExternalMouse(Mouse externalMouse) {
        this.externalMouse = externalMouse;
    }

    public String getGraphicCard() {
        return graphicCard;
    }

    public void setGraphicCard(String graphicCard) {
        this.graphicCard = graphicCard;
    }

    public boolean isDiskDrive() {
        return diskDrive;
    }

    public void setDiskDrive(boolean diskDrive) {
        this.diskDrive = diskDrive;
    }

    public String toString() {
        return super.toString() + "\nGraphic card: " + graphicCard + "\nIs have disk drive: " + diskDrive + externalMouse.toString();
    }

    public void coding() {
        System.out.println("Started IntelliJ IDEA");
    }
}
