package lesson_26.abstract_classes;

public class Lion extends Animal{

    @Override
    public void sound() {
        System.out.println("Roar");
    }

    @Override
    public void move(){
        System.out.println("Every lion can move");
    }
}
