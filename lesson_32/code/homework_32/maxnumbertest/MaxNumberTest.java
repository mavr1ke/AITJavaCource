package homework_32.maxnumbertest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxNumberTest {

    MaxNumber maxNumber;

    @BeforeEach
    public void setUp() {
        maxNumber = new MaxNumber();
    }

    @Test
    @DisplayName("Check work with empty array")
    public void zeroElt_test() {
        int[] testArray = {};
        assertEquals(-1, maxNumber.findMax(testArray));
    }

    @Test
    @DisplayName("Check work with array of one element")
    public void oneElt_test() {
        int[] testArray = {2};
        assertEquals(2, maxNumber.findMax(testArray));
    }

    @Test
    @DisplayName("Check work with array of two elements")
    public void twoElt_test() {
        int[] testArray = {2, 2};
        assertEquals(2, maxNumber.findMax(testArray));
    }

    @Test
    @DisplayName("Check work with array of several elements and max in the middle")
    public void severalElt_maxMiddle_test() {
        int[] testArray = {2, 4, 7, 9, 3, 1, 5};
        assertEquals(9, maxNumber.findMax(testArray));
    }

    @Test
    @DisplayName("Check work with array of several elements and max at the first pos")
    public void severalElt_maxFirst_test() {
        int[] testArray = {10, 4, 7, 9, 3, 1, 5};
        assertEquals(10, maxNumber.findMax(testArray));
    }

    @Test
    @DisplayName("Check work with array of several elements and max at the last pos")
    public void severalElt_maxLast_test() {
        int[] testArray = {2, 4, 7, 9, 3, 1, 12};
        assertEquals(12, maxNumber.findMax(testArray));
    }

}