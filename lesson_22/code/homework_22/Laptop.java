package homework_22;

public class Laptop extends Device {

    private String graphicCard;
    private boolean diskDrive;

    public Laptop(String model, float price, String graphicCard, boolean diskDrive) {
        super(model, price);
        this.graphicCard = graphicCard;
        this.diskDrive = diskDrive;
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

    public void coding() {
        System.out.println("Started IntelliJ IDEA");
    }
}
