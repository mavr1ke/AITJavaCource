package lesson_38.linkedlist_implementation;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OurLinkedListTest {

    private OurLinkedList<Integer> list;

    @BeforeEach
    public void init() {
        list = new OurLinkedList<>();
    }

    @Test
    public void testAppendGet_emptyList_addsOneElement() {
        list.append(5);
        assertEquals(5, list.get(0));
    }

    @Test
    public void testAppendGet_emptyList_addSeveralElements() {
        Integer[] expected = {2, 3, -1, 23, 5, 75, 8, 6, 3, 2, 4, -2, -5, 0, 12};
        for (Integer integer : expected) {
            list.append(integer);
        }

        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], list.get(i));
        }
    }

    @Test
    public void testSize_emptyList_appendsOneElement() {
        list.append(5);
        assertEquals(1, list.size());
    }

    @Test
    public void testSize_emptyList_addSeveralElements() {
        Integer[] expected = {2, 3, -1, 23, 5, 75, 8, 6, 3, 2, 4, -2, -5, 0, 12};
        for (Integer integer : expected) {
            list.append(integer);
        }
        assertEquals(expected.length, list.size());

    }

    @Test
    public void testSet_oneElement_swapsElement() {
        list.append(0);
        list.set(10, 0);
        assertEquals(10, list.get(0));
    }

    @Test
    public void testSet_severalElements_swapsFirstMiddleElements() {
        Integer[] source = {1, 4, -17, 18, 6};

        for (Integer integer : source) {
            list.append(integer);
        }

        list.set(10, 0);
        list.set(100, 4);
        list.set(-1000, 2);

        Integer[] expected = {10, 4, -1000, 18, 100};

        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], list.get(i));
        }
    }

    @Test
    public void testRemoveById_nonEmptyList_removesFirstElement() {
        list.append(5);
        list.append(15);
        list.append(2);
        list.append(17);
        list.append(23);

        Integer val = list.removeById(0);
        assertEquals(5, val);

        Integer[] expected = {15, 2, 17, 23};

        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], list.get(i));
        }

        assertEquals(4, list.size());
    }

    @Test
    public void testRemoveById_nonEmptyList_removesMiddleElement() {
        list.append(5);
        list.append(15);
        list.append(2);
        list.append(17);
        list.append(23);

        Integer val = list.removeById(2);
        assertEquals(2, val);

        Integer[] expected = {5, 15, 17, 23};

        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], list.get(i));
        }

        assertEquals(4, list.size());
    }

    @Test
    public void testRemoveById_nonEmptyList_removesLastElement() {
        list.append(5);
        list.append(15);
        list.append(2);
        list.append(17);
        list.append(23);

        Integer val = list.removeById(4);
        assertEquals(23, val);

        Integer[] expected = {5, 15, 2, 17};

        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], list.get(i));
        }

        assertEquals(4, list.size());
    }


    @Test
    public void testRemove_nonEmptyList_removesLastElement() {
        list.append(5);
        list.append(15);
        list.append(2);
        list.append(17);
        list.append(23);

        boolean removed = list.remove(23);
        assertTrue(removed);

        Integer[] expected = {5, 15, 2, 17};

        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], list.get(i));
        }

        assertEquals(4, list.size());
    }

    @Test
    public void testRemove_nonEmptyList_removesMiddleElement() {
        list.append(5);
        list.append(15);
        list.append(2);
        list.append(17);
        list.append(23);

        boolean removed = list.remove(2);
        assertTrue(removed);

        Integer[] expected = {5, 15, 17, 23};

        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], list.get(i));
        }

        assertEquals(4, list.size());
    }

    @Test
    public void testContains_nonEmptyList_containsElements() {
        list.append(5);
        list.append(15);
        list.append(2);
        list.append(17);
        list.append(23);

        assertTrue(list.contains(5));
        assertTrue(list.contains(17));
        assertTrue(list.contains(23));
    }

    @Test
    public void testContains_nonEmptyList_notContainsElements() {
        list.append(5);
        list.append(15);
        list.append(2);
        list.append(17);
        list.append(23);

        assertFalse(list.contains(1));
        assertFalse(list.contains(16));
        assertFalse(list.contains(22));
    }
}