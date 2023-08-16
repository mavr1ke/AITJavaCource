package homework_22;

public class Parrot extends HomeAnimal {

    private String color;
    private String type;

    public Parrot(String name, byte age, String color, String type) {
        super(name, age);
        setColor(color);
        setType(type);
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

    public void repeating(String string) {
        System.out.println("*squawk* " + string);
    }
}
