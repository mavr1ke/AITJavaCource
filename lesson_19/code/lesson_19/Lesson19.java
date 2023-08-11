package lesson_19;

public class Lesson19 {
    public static void main(String[] args) {

        Cat cat = new Cat();
        cat.whoAmI();
//        cat.name = "";
//        cat.age = -2;
//        cat.weight = -42;
        cat.whoAmI();
        cat.setName("Barsik");
        cat.setAge(-2);
        cat.setWeight(1000);

        System.out.println("Name: " + cat.getName());
        System.out.println("Age: " + cat.getAge());
        System.out.println("Weight: " + cat.getWeight());

        cat.startRunning(5);
    }
}
