package homework_43;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.LinkedHashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class HWMainTest {

    Map<String,Boolean> expected;
    @BeforeEach
    public void setUp() {
        expected = new LinkedHashMap<>();
    }

    @Test
    public void test_isStringsRepeating_withOnlyOneRepeatingElement() {
        String[] actual = {"Jack"};

        expected.put("Jack",false);

        assertEquals(expected, HWMain.isStringsRepeating(actual));
    }

    @Test
    public void test_isStringsRepeating_withOneRepeatingElement() {
        String[] actual = {"Jack", "Bill", "Jack", "Ann", "John"};

        expected.put("Jack",true);
        expected.put("Bill",false);
        expected.put("Ann",false);
        expected.put("John",false);

        assertEquals(expected, HWMain.isStringsRepeating(actual));
    }

    @Test
    public void test_isStringsRepeating_withSeveralRepeatingElements() {
        String[] actual = {"Jack", "Bill", "Jack", "Ann", "Bill"};

        expected.put("Jack",true);
        expected.put("Ann",false);
        expected.put("Bill",true);

        assertEquals(expected, HWMain.isStringsRepeating(actual));
    }

    @Test
    public void test_isStringsRepeating_withSeveralTimesRepeatingElement() {
        String[] actual = {"Jack", "Jack", "Jack", "Jack", "Bill"};

        expected.put("Jack",true);
        expected.put("Bill",false);

        assertEquals(expected, HWMain.isStringsRepeating(actual));
    }

}