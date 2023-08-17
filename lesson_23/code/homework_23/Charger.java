package homework_23;

public class Charger {

    private String type;
    private boolean isWireless;

    public Charger(String type, boolean isWireless) {
        this.type = type;
        this.isWireless = isWireless;
    }

    public String getType() {
        return type;
    }

    public boolean isWireless() {
        return isWireless;
    }

    public String toString() {
        return "\nCharger type: " + type + "\nIs charger wireless: " + isWireless;
    }
}
