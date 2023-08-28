package lesson_and_hw29;

public abstract class Car implements Movable{

    private String model;
    private String manufacturer;
    private int year;
    private String colour;

    public Car(String model, String manufacturer, int year, String colour) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.year = year;
        this.colour = colour;
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getYear() {
        return year;
    }

    public String getColour() {
        return colour;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", year=" + year +
                ", colour='" + colour + '\'' +
                '}';
    }
}
