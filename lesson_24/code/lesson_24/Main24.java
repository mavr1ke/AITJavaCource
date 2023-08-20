package lesson_24;

public class Main24 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        Hamster hamster = new Hamster();
        cat.eat();

        Animal[] animals = new Animal[3];
        animals[0] = cat;
        animals[1] = dog;
        animals[2] = hamster;

        for (Animal animal: animals) {
            animal.voice();
        }

//        Object objectCat = new Cat();


//        cat.voice();
//        dog.voice();
//        hamster.voice();
    }
}
