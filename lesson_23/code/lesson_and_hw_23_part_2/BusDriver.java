package lesson_and_hw_23_part_2;

import java.util.Arrays;

public class BusDriver {

    private String name;
    private String[] categories;
    private int age;
    private final int id;
    static private int idCounter;

    public BusDriver(String name, int age) {
        this.name = name;
        this.age = age;
        this.categories = new String[1];
        categories[0] = "D";
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

    public boolean addCategory(String category) {
        if (category.length() > 0) {
            categories = Arrays.copyOf(categories, categories.length + 1);
            categories[categories.length - 1] = category.trim();
            return true;
        } else
            return false;
    }

    public int searchCategory(String category){
        for (int i = 0; i < categories.length; i++) {
            if (categories[i].equals(category)) {
                return i;
            }
        }
        return -1;
    }
    public void removeCategory(String category) {
        if (category.length() > 0 && categories.length >= 1) {
            int delIndex = searchCategory(category);
            if (delIndex >= 0) {
                for (int i = delIndex; i < categories.length - 1; i++) {
                    categories[i] = categories[i + 1];
                }
            } else {
                System.out.println("Category not found");
            }
            categories = Arrays.copyOf(categories, categories.length - 1);
            System.out.println("Category removed");
        } else {
            System.out.println("Empty written category or zero categories");
        }
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
