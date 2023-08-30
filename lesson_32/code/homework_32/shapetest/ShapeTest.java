package homework_32.shapetest;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShapeTest {

    Shape[] shapes;

    @Test
    @DisplayName("Check work with array of same type figures")
    public void severalFiguresOfSameType_totalSquare_test() {
        shapes = new Shape[2];
        shapes[0] = new Rectangle(5, 10);
        shapes[1] = new Rectangle(3, 6);
        assertEquals(68.00, shapes[0].totalSquare(shapes));
    }

    @Test
    @DisplayName("Check work with array of different type figures")
    public void severalFiguresOfDifferentType_totalSquare_test() {
        shapes = new Shape[3];
        shapes[0] = new Rectangle(5, 10);
        shapes[1] = new Circle(7);
        shapes[2] = new Rectangle(3, 6);
        assertEquals(221.909, shapes[0].totalSquare(shapes));
    }

    @Test
    @DisplayName("Check work with empty array")
    public void zeroFigures_totalSquare_test() {
        shapes = new Shape[0];
        assertEquals(0, shapes[0].totalSquare(shapes));
    }

    @Test
    @DisplayName("Check work with array of only one figure")
    public void oneFigure_totalSquare_test() {
        shapes = new Shape[1];
        shapes[0] = new Rectangle(5, 10);
        assertEquals(50.00, shapes[0].totalSquare(shapes));
    }
}