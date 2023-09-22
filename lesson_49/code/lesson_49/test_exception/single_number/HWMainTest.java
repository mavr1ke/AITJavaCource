package lesson_49.test_exception.single_number;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class HWMainTest {

    @Test
    public void testFindSingleNumber_Example1() {
        List<Integer> numbers = List.of(1, 3, 1);
        int result = HWMain.findSingleNumber(numbers);
        assertEquals(3, result);
    }

    @Test
    public void testFindSingleNumber_Example2() {
        List<Integer> numbers = List.of(3, 3, 3);
        int result = HWMain.findSingleNumber(numbers);
        assertEquals(3, result);
    }

    @Test
    public void testFindSingleNumber_Example3() {
        List<Integer> numbers = List.of(1, 1, 15, 1, 1);
        int result = HWMain.findSingleNumber(numbers);
        assertEquals(15, result);
    }

    @Test
    public void testFindSingleNumber_Example4() {
        List<Integer> numbers = List.of(1, 8, 8, 8, 8, 8, 1, 2, 2);
        int result = HWMain.findSingleNumber(numbers);
        assertEquals(8, result);
    }

    @Test
    public void testFindSingleNumber_throwsNoSuchElementException() {
        List<Integer> numbers = List.of(1, 1);
        assertThrows(NoSuchElementException.class, () -> HWMain.findSingleNumber(numbers));
    }

}