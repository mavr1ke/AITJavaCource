package homework_33.animals;


import java.util.Comparator;

public class LastAnimalNameLetterComparator implements Comparator<Animal> {

    @Override
    public int compare(Animal a1, Animal a2) {
        return Character.compare(a1.getName().charAt(a1.getName().length() - 1),
                a2.getName().charAt(a2.getName().length() - 1));
    }
}
