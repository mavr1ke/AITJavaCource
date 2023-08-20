package lesson_24.shapes;

public class Rectangle extends Shape{
    private int height;
    private int width;

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public void calculateSquare() {
        int square = height * width;
        System.out.println("Square: " + square);
    }

    @Override
    public void remit() {
        int remit = 2 * (height + width);
        System.out.println("Remit: " + remit);
    }
}
