package lesson_26.abstract_classes;

public class AnimalMain {
    public static void main(String[] args) {
        //Animal animal = new Animal();
        Animal dog = new Dog();
        Animal lion = new Lion();

        //animal.sound();
        dog.sound();
        lion.sound();
        dog.move();
        lion.move();
    }
}
