package homework_35.animals;


import java.util.Arrays;

public class AnimalMain {
    public static void main(String[] args) {

        Animal animal1 = new Animal("Snake", 3, "Red");
        Animal animal2 = new Animal("Bear", 20, "Brown");
        Animal animal3 = new Animal("Dog", 10, "Black");
        Animal animal4 = new Animal("Wolf", 13, "Gray");
        Animal animal5 = new Animal("Turtle", 1, "Green");

        Animal[] animals = {animal1, animal2, animal3, animal4, animal5};

        System.out.println("\nBefore sort");
        for (Animal animal : animals) {
            System.out.println(animal);
        }

        System.out.println("\nSort by animal's name");
//        Arrays.sort(animals, new AnimalNameComparator());

        AnimalComparator animalNameComparator;
        animalNameComparator = (a1, a2) -> a1.getName().compareTo(a2.getName());
        Arrays.sort(animals, animalNameComparator);

        for (Animal animal : animals) {
            System.out.println(animal);
        }

        System.out.println("\nSort by animal's weight");
//        Arrays.sort(animals, new AnimalWeightComparator());

        AnimalComparator animalWeightComparator;
        animalWeightComparator = (a1, a2) -> Integer.compare(a1.getWeight(),a2.getWeight());
        Arrays.sort(animals, animalWeightComparator);

        for (Animal animal : animals) {
            System.out.println(animal);
        }

        System.out.println("\nSort by animal's color");
//        Arrays.sort(animals, new AnimalColorComparator());

        AnimalComparator animalColorComparator;
        animalColorComparator = (a1, a2) -> a1.getColor().compareTo(a2.getColor());
        Arrays.sort(animals, animalColorComparator);

        for (Animal animal : animals) {
            System.out.println(animal);
        }

        System.out.println("\nSort by animal name last letter");
//        Arrays.sort(animals, new LastAnimalNameLetterComparator());

        AnimalComparator animalLastNameLetterComparator;
        animalLastNameLetterComparator = (a1, a2) -> Character.compare(a1.getName().charAt(a1.getName().length() - 1),
                a2.getName().charAt(a2.getName().length() - 1));
        Arrays.sort(animals, animalLastNameLetterComparator);

        for (Animal animal : animals) {
            System.out.println(animal.getName());
        }

    }
}
