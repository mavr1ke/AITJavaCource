package homework_33.animals;


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
        Arrays.sort(animals, new AnimalNameComparator());
        for (Animal animal : animals) {
            System.out.println(animal);
        }

        System.out.println("\nSort by animal's weight");
        Arrays.sort(animals, new AnimalWeightComparator());
        for (Animal animal : animals) {
            System.out.println(animal);
        }

        System.out.println("\nSort by animal's color");
        Arrays.sort(animals, new AnimalColorComparator());
        for (Animal animal : animals) {
            System.out.println(animal);
        }

        System.out.println("\nSort by animal name last letter");
        Arrays.sort(animals, new LastAnimalNameLetterComparator());
        for (Animal animal : animals) {
            System.out.println(animal.getName());
        }

    }
}
