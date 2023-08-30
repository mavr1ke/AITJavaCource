package homework_32.shapetest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShapeTest {

    Shape[] shapes;

    @Test
    public void severalFiguresOfSameType_totalSquare_test() {
        shapes = new Shape[2];
        shapes[0] = new Rectangle(5, 10);
        shapes[1] = new Rectangle(3, 6);
        assertEquals(68.00, shapes[0].totalSquare(shapes));
    }

    @Test
    public void severalFiguresOfDifferentType_totalSquare_test() {
        shapes = new Shape[3];
        shapes[0] = new Rectangle(5, 10);
        shapes[1] = new Circle(7);
        shapes[2] = new Rectangle(3, 6);
        assertEquals(221.909, shapes[0].totalSquare(shapes));
    }

    @Test
    public void zeroFigures_totalSquare_test() {
        shapes = new Shape[0];
        assertEquals(0, shapes[0].totalSquare(shapes));
    }

    @Test
    public void oneFigure_totalSquare_test() {
        shapes = new Shape[1];
        shapes[0] = new Rectangle(5, 10);
        assertEquals(50.00, shapes[0].totalSquare(shapes));
    }
}