package lesson_26.abstract_classes;

public class Dog extends Animal{

    @Override
    public void sound() {
        System.out.println("Woof");
    }

    @Override
    public void move(){
        System.out.println("Every dog can move");
    }
}
