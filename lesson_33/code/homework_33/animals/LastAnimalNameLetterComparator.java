package homework_33.animals;


import java.util.Comparator;

public class LastAnimalNameLetterComparator implements Comparator<Animal> {

    @Override
    public int compare(Animal a1, Animal a2) {
        return Character.compare(a1.name.charAt(a1.name.length() - 1), a2.name.charAt(a2.name.length() - 1));
    }
}
