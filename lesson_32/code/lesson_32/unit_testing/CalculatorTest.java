package lesson_32.unit_testing;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculator;
    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
    }
    @Test
    @DisplayName("Simple multiplication should be correct")
    void testMultiply() {
        assertEquals(20,calculator.multiply(4,5));
    }
    @Test
    @DisplayName("Check correct handing of zero")
    void testMultiplyZero(){
        assertEquals(0,calculator.multiply(0,5));
        assertEquals(0,calculator.multiply(5,0));
    }

}