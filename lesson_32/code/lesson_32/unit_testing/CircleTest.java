package lesson_32.unit_testing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    //given___when___then___
    //givenRadius_whenFindArea_thenReturnArea
    @Test
    public void givenRadius1_whenFindArea_thenReturnArea3_14() {
        double expectedArea = Math.PI;
        double actualArea = Circle.findArea(1d);

        assertEquals(expectedArea, actualArea);
    }

    @Test
    public void givenAAndB_whenCompare_thenReturnBoolean() {
        assertTrue(Circle.compareNumbers(5, 3));
    }

    @Test
    public void givenThreeAndZero_whenCompare_thenReturnTrue() {
        assertTrue(Circle.compareNumbers(0, 3));
    }

    @Test
    public void givenThreeLessZero_whenResultFalse_thenReturnTrue() {
        assertFalse(3 < 0);
        assertFalse(Circle.compareNumbers(0,3));
    }
}