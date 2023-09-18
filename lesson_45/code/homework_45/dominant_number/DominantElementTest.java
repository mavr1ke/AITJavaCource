package homework_45.dominant_number;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DominantElementTest {

    DominantElement dominantElement;
    @BeforeEach
    public void setUp() {
        dominantElement = new DominantElement();
    }

    @Test
    public void testFindDominantMerge_NoDominantElement() {
        int[] arr = {1, 2, 2, 2, 3};
        int result = dominantElement.findDominantMerge(arr);
        assertEquals(-1, result);
    }

    @Test
    public void testFindDominantMerge_DominantElementExists() {
        int[] arr = {3, 3, 3, 3, 4};
        int result = dominantElement.findDominantMerge(arr);
        assertEquals(3, result);
    }

    @Test
    public void testFindDominantMerge_SingleElementArray() {
        int[] arr = {1};
        int result = dominantElement.findDominantMerge(arr);
        assertEquals(1, result);
    }

}