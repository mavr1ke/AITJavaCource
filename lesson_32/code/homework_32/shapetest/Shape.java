package homework_32.shapetest;

public interface Shape {

    double PI = 3.141;
    double square();
    double perimeter();

    default double totalSquare(Shape[] shapes) {
        double total = 0;
        for (Shape shape : shapes) {
            total += shape.square();
        }
        return total;
    }
}
