package lesson_16;

public class Cat {
    String name;
    String color;
    int age;

    public Cat(int age) {
        this.age = age;
    }

    public Cat(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Cat(int catAge, String catName, String catColor){
        this.age = catAge;
        this.name = catName;
        this.color = catColor;
    }

    public Cat() {
    }

    void sayMeow() {
        System.out.println("Meow!!!");
    }

    void sleep() {
        System.out.println("I am sleeping");
    }

    void running() {
        System.out.println("I am running!!");
    }
}
