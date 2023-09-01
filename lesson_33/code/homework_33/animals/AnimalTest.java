package homework_33.animals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {

    Animal animal1 = new Animal("Anaconda", 3, "Dark-gray");
    Animal animal2 = new Animal("Bear", 20, "Brown");
    Animal animal3 = new Animal("Elephant", 1000, "Black");
    Animal animal4 = new Animal("Wolf", 13, "Gray");
    Animal animal5 = new Animal("Fox", 5, "Orange");

    Animal[] actual = {animal1, animal2, animal3, animal4, animal5};
    @Test
    @DisplayName("Sort of animal array by name test")
    public void sortedByName_test() {
        Animal[] expected = {animal1, animal2, animal3, animal5, animal4};
        Arrays.sort(actual, new AnimalNameComparator());
        assertArrayEquals(expected, actual);
    }

    @Test
    @DisplayName("Sort of animal array by weight test")
    public void sortedByWeight_test() {
//        AnimalWeightComparator animalWeightComparator = new AnimalWeightComparator();
//        assertFalse(animalWeightComparator.compare(animal1,animal2) > 0);
        Animal[] expected = {animal1, animal5, animal4, animal2, animal3};
        Arrays.sort(actual, new AnimalWeightComparator());
        assertArrayEquals(expected, actual);
    }

    @Test
    @DisplayName("Sort of animal array by color test")
    public void sortedByColor_test() {
        Animal[] expected = {animal3, animal2, animal1, animal4, animal5};
        Arrays.sort(actual, new AnimalColorComparator());
        assertArrayEquals(expected, actual);
    }

    @Test
    @DisplayName("Sort of animal array by last letter in name test")
    public void sortedByLastLetterInName_test() {
        Animal[] expected = {animal1, animal4, animal2, animal3, animal5};
        Arrays.sort(actual, new LastAnimalNameLetterComparator());
        assertArrayEquals(expected, actual);
    }

}