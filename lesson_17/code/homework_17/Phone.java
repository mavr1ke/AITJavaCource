package homework_17;

public class Phone {
    long number;
    String model;
    short weight;

    public Phone(long number, String model, short weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    void phoneInfo() {
        System.out.println("Phone number: " + number);
        System.out.println("Phone model: " + model);
        System.out.println("Phone weight: " + weight);
    }
}
