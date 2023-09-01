package homework_33.animals;

import java.util.Comparator;

public class AnimalColorComparator implements Comparator<Animal> {
    @Override
    public int compare(Animal a1, Animal a2) {
        return a1.getColor().compareTo(a2.getColor());
    }
}
