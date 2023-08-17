package homework_23;

public class Parrot extends HomeAnimal {

    private String color;
    private String type;
    private Cage cage;

    public Parrot(String name, byte age, String color, String type, Cage cage) {
        super(name, age);
        this.color = color;
        this.type = type;
        this.cage = cage;
    }

    public Cage getCage() {
        return cage;
    }

    public void setCage(Cage cage) {
        this.cage = cage;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String toString() {
        return super.toString() + "\nParrot color: " + color + "\nParrot type: " + type + cage.toString();
    }

    public void repeating(String string) {
        System.out.println("*squawk* " + string);
    }
}
