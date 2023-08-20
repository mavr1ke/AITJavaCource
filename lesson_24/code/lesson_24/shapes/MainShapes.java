package lesson_24.shapes;

public class MainShapes {
    public static void main(String[] args) {

        Round round = new Round(10);
        Rectangle rectangle = new Rectangle(5,4);

        Shape[] shapes = new Shape[2];
        shapes[0] = round;
        shapes[1] = rectangle;

        for (Shape shape: shapes) {
            shape.calculateSquare();
            shape.remit();
        }
    }
}
