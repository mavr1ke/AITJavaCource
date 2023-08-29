package wrapper_classes_and_generics;

public class Person<T> {

    private String name;
    private T age;

    public Person(String name, T age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public T getAge() {
        return age;
    }
}
