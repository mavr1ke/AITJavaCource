package lesson_and_homework_44.map_exercises;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MapExercisesTest {

    @Test
    public void testNameToNumberOccurrence() {
        List<String> names = new ArrayList<>(Arrays.asList("John", "Jake", "John", "Ann", "Paul", "Ann"));
        String name = "Ann";
        int result = MapExercises.nameToNumberOccurrence(names, name);

        assertEquals(2, result);
    }

    @Test
    public void testNonExistingNameToNumberOccurrence() {
        List<String> names = new ArrayList<>(Arrays.asList("John", "Jake", "John", "Ann", "Paul", "Ann"));
        String name = "Mary";
        int result = MapExercises.nameToNumberOccurrence(names, name);
        assertEquals(0, result);
    }

    @Test
    public void testListOfTheSameNameToNumberOccurrence() {
        List<String> names = new ArrayList<>(Arrays.asList("John", "John", "John", "John", "John", "John"));
        String name = "John";
        int result = MapExercises.nameToNumberOccurrence(names, name);
        assertEquals(6, result);
    }

    @Test
    public void testFindNameAndAnagrams() {
        List<String> names = Arrays.asList("john", "ann", "bill", "nan", "nna", "llbi", "ohnj");
        String inputName = "ann";

        List<String> result = MapExercises.findNameAndAnagrams(names, inputName);

        assertTrue(result.contains("ann"));
        assertTrue(result.contains("nan"));
        assertTrue(result.contains("nna"));

        assertFalse(result.contains("john"));
        assertFalse(result.contains("bill"));
        assertFalse(result.contains("llbi"));
        assertFalse(result.contains("ohnj"));

        assertEquals(3, result.size());
    }

    @Test
    public void testFindNameAndAnagramsNoMatches() {
        List<String> names = Arrays.asList("john", "bill", "llbi", "ohnj");
        String inputName = "ann";

        List<String> result = MapExercises.findNameAndAnagrams(names, inputName);

        assertTrue(result.isEmpty());
    }

    @Test
    public void testFindNameAndAnagramsEmptyList() {
        List<String> names = List.of();
        String inputName = "ann";

        List<String> result = MapExercises.findNameAndAnagrams(names, inputName);

        assertTrue(result.isEmpty());
    }

    @Test
    public void testFindNameAndAnagramsV2() {
        List<String> names = Arrays.asList("john", "ann", "bill", "nan", "nna", "llbi", "ohnj");
        String inputName = "ann";

        List<String> result = MapExercises.findNameAndAnagramsV2(names, inputName);

        assertTrue(result.contains("ann"));
        assertTrue(result.contains("nan"));
        assertTrue(result.contains("nna"));

        assertFalse(result.contains("john"));
        assertFalse(result.contains("bill"));
        assertFalse(result.contains("llbi"));
        assertFalse(result.contains("ohnj"));

        assertEquals(3, result.size());
    }

    @Test
    public void testFindNameAndAnagramsV2NoMatches() {
        List<String> names = Arrays.asList("john", "bill", "llbi", "ohnj");
        String inputName = "ann";

        List<String> result = MapExercises.findNameAndAnagramsV2(names, inputName);

        assertTrue(result.isEmpty());
    }

    @Test
    public void testFindNameAndAnagramsV2EmptyList() {
        List<String> names = List.of();
        String inputName = "ann";

        List<String> result = MapExercises.findNameAndAnagramsV2(names, inputName);

        assertTrue(result.isEmpty());
    }

}