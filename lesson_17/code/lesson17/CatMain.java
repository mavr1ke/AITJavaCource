package lesson17;

public class CatMain {
    public static void main(String[] args) {
        Cat cat = new Cat("Max", 5.0);

//        cat.whoAmI();
//        cat.eat();
//        cat.whoAmI();
//        cat.run();
//        cat.whoAmI();

        cat.startTraining(10);

        cat.whoAmI();
    }
}
