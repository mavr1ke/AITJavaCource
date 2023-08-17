package homework_23;

public class Collar {

    private String collarColor;
    private String collarMaterial;

    public Collar(String collarColor, String collarMaterial) {
        this.collarColor = collarColor;
        this.collarMaterial = collarMaterial;
    }

    public String getCollarColor() {
        return collarColor;
    }

    public void setCollarColor(String collarColor) {
        this.collarColor = collarColor;
    }

    public String getCollarMaterial() {
        return collarMaterial;
    }

    public void setCollarMaterial(String collarMaterial) {
        this.collarMaterial = collarMaterial;
    }

    public String toString() {
        return "\nCollar color: " + collarColor + "\nCollar material: " + collarMaterial;
    }
}
