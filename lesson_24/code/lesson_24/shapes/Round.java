package lesson_24.shapes;

public class Round extends Shape{
    private double radius;

    private static final double PI = 3.1415;

    public Round(double radius) {
        this.radius = radius;
    }

    @Override
    public void calculateSquare() {
        double square = PI * radius * radius;
        System.out.println("Square: " + square);
    }

    @Override
    public void remit() {
       double remit = 2 * PI * radius;
        System.out.println("Remit: " + remit);
    }
}
