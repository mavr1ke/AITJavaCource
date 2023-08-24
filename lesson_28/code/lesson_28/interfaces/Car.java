package lesson_28.interfaces;

public class Car implements Movable,Breakable {

    @Override
    public void canMove() {
        System.out.println("car can drive");
    }

    @Override
    public void canBreak() {
        System.out.println("car can break");
    }
}
