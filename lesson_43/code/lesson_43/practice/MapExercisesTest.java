package lesson_43.practice;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class MapExercisesTest {

    @Test
    public void abTest_true() {
        Map<String, String> actual = new HashMap<>();
        actual.put("a", "Hi");
        actual.put("b", "There");

        Map<String, String> expected = new HashMap<>();
        expected.put("a", "Hi");
        expected.put("b", "There");
        expected.put("ab", "HiThere");

        assertEquals(expected, MapExercises.findKeysAB(actual));
    }

    @Test
    public void abTest_noA() {
        Map<String, String> actual = new HashMap<>();
        actual.put("c", "Hi");
        actual.put("b", "There");

        assertEquals(actual, MapExercises.findKeysAB(actual));
    }

    @Test
    public void abTest_noB() {
        Map<String, String> actual = new HashMap<>();
        actual.put("c", "Hi");
        actual.put("a", "There");

        assertEquals(actual, MapExercises.findKeysAB(actual));
    }

    @Test
    public void abTest_noAAndB() {
        Map<String, String> actual = new HashMap<>();
        actual.put("c", "Hi");
        actual.put("d", "There");

        assertEquals(actual, MapExercises.findKeysAB(actual));
    }
}