package homework_35.animals;

import java.util.Comparator;

public interface AnimalComparator extends Comparator<Animal> {
    @Override
    int compare(Animal a1, Animal a2);
}
