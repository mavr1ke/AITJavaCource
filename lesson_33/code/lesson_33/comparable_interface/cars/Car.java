package lesson_33.comparable_interface.cars;

public class Car implements Comparable<Car>{

    private final String model;
    private final int year;
    private final int price;

    public Car(String model, int year, int price) {
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Car car) {
        return this.getPrice() - car.getPrice();
    }
}
