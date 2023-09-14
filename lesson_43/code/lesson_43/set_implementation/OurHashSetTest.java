package lesson_43.set_implementation;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OurHashSetTest {

    OurSet<Integer> ourSet;
    @BeforeEach
    public void setUp() {
        ourSet = new OurHashSet<>();
    }
    @Test
    public void size_returnsNumberOfElementsInSet() {

        ourSet.add(1);
        ourSet.add(6);
        ourSet.add(1);
        ourSet.add(6);
        ourSet.add(4);

        assertEquals(3, ourSet.size());
    }

    @Test
    public void add_returnsTrueForNewElt() {
        boolean result = ourSet.add(1);
        assertTrue(result);
    }

    @Test
    public void add_returnsFalseForExistingElt() {
        ourSet.add(1);
        boolean result = ourSet.add(1);
        assertFalse(result);
    }

    @Test
    public void remove_returnsTrueForExistingElt() {
        ourSet.add(1);
        boolean result = ourSet.remove(1);
        assertTrue(result);
    }

    @Test
    public void remove_returnsFalseForNonExistingElt() {
        ourSet.add(1);
        boolean result = ourSet.remove(2);
        assertFalse(result);
    }

    @Test
    public void contains_returnsTrueForExistingElt() {
        ourSet.add(1);
        boolean result = ourSet.contains(1);
        assertTrue(result);
    }
}