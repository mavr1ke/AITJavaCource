package lesson_23;

import java.util.Arrays;

public class BusDriver {

    private String name;
    private final String[] categories;
    private int age;
    private final int id;
    static private int idCounter;

    public BusDriver(String name, int age) {
        this.name = name;
        this.age = age;
        this.categories = new String[1];
        categories[0] = "B";
        this.id = idCounter++;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getCategories() {
        return categories;
    }

    public void addCategory(String category) {
        //TODO
    }

    public void removeCategory(String category) {
        //TODO
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String toString() {
        return "{id: " + id + "; name: " + name
                + ": categories: " + Arrays.toString(categories) + "}";
    }

    public void driveBus(Bus bus) {
        System.out.println("Driver id:" + id + " is driving a bus id:" + bus.getId());
    }
}
