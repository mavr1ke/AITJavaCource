package lesson_20;

public class Main20 {
    int noStatic = 10;
    static int staticInt = 20;

    public static void main(String[] args) {

        Car car = new Car("BMW", 200);
        Car car1 = new Car("Skoda", 110);
        Car car2 = new Car("Seat", 120);

        System.out.println("Car count: " + Car.carCount);
        Car.showStaticInfo();

        System.out.println("Sum: " + MathUtils.sumOfInts(5, 6, 7, 8));
    }

    static void test() {
        staticInt++;
    }

    public void testNoStatic() {
        staticInt++;
        noStatic++;
    }
}
