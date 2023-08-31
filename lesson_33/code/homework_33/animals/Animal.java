package homework_33.animals;

public class Animal {

    String name;
    int weight;
    String color;

    public Animal(String name, int weight, String color) {
        this.name = name;
        this.weight = weight;
        this.color = color;
    }

    @Override
    public String toString() {
        return name + " " + weight + " " + color;
    }

    public String getName() {
        return name;
    }
}
