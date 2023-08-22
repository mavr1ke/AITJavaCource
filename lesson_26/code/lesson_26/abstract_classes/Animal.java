package lesson_26.abstract_classes;

public abstract class Animal {

    public abstract void sound();

    public void move(){
        System.out.println("Every animal can move");
    }
}
