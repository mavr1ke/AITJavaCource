package homework_33.animals;

import java.util.Comparator;

public class AnimalColorComparator implements Comparator<Animal> {
    @Override
    public int compare(Animal a1, Animal a2) {
        return a1.color.compareTo(a2.color);
    }
}
