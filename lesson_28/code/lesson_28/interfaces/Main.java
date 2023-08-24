package lesson_28.interfaces;

public class Main {
    public static void main(String[] args) {
        Breakable car = new Car();
        Movable car1 = new Car();
       // Car car1 = new Car();
        car1.canMove();
        car.canBreak();;
    }
}
