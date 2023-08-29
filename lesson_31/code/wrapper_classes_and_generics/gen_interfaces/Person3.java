package wrapper_classes_and_generics.gen_interfaces;

public class Person3 {

    private String name;
    private int age;

    <T>Person3(T name, int age) {
        this.name = name.toString();
        this.age = age;
    }
}
