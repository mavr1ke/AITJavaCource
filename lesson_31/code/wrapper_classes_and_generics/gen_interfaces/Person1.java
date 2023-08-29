package wrapper_classes_and_generics.gen_interfaces;

public class Person1 implements Personable<Integer>{
    private String name;
    private int age;

    public Person1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public Integer getAge() {
        return age;
    }

    @Override
    public String getName() {
        return name;
    }
}
