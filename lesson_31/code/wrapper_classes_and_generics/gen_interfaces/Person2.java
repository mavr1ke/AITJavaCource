package wrapper_classes_and_generics.gen_interfaces;

public class Person2<N,T> {
    private N name;
    private T age;

    public Person2(N name, T age) {
        this.name = name;
        this.age = age;
    }

    public N getName() {
        return name;
    }

    public T getAge() {
        return age;
    }
}
