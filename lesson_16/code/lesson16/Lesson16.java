package lesson16;

public class Lesson16 {
    public static void main(String[] args) {

        Cat cat = new Cat();


        cat.sayMeow();
        System.out.println(cat.age);
        cat.running();

        Cat cat1 = new Cat(5);
        System.out.println(cat1.age);
        System.out.println(cat1.name);

        System.out.println("==================");

        Cat cat2 = new Cat(3, "Max");
        cat2.sayMeow();
        cat2.running();
        System.out.println("Cat name: " + cat2.name);
        System.out.println("Cat age: " + cat2.age);

        System.out.println("===================");

        Cat catBoris = new Cat(5, "Boris", "red");

        catBoris.sleep();
        System.out.println("Cat name: " + catBoris.name);
        System.out.println("Cat age: " + catBoris.age);
        System.out.println("Cat color: " + catBoris.color);
    }
}
