package homework_35.animals;

import java.util.Comparator;

public class AnimalNameComparator implements Comparator<Animal> {
    @Override
    public int compare(Animal a1, Animal a2) {
        return a1.getName().compareTo(a2.getName());
    }
}
