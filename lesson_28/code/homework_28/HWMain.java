package homework_28;

public class HWMain {
    public static void main(String[] args) {

        System.out.println("***********");
        Shape[] shapes = new Shape[3];
        shapes[0] = new Rectangle(5, 10);
        shapes[1] = new Circle(7);
        shapes[2] = new Rectangle(3, 6);

        for (Shape shape : shapes) {
            System.out.printf("\nSquare: %.2f", shape.square());
            System.out.printf("\nPerimeter: %.2f", shape.perimeter());
            System.out.println();
        }

        double total = shapes[0].totalSquare(shapes);
        System.out.printf("\nTotal square of all shapes: %.2f", total);

    }
}
