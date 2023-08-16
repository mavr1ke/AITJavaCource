package homework_22;

public class HomeAnimal {

    private String name;
    private byte age;
    private final int id;
    static private int idCounter;

    public HomeAnimal(String name, byte age) {
        this.name = name;
        this.age = age;
        this.id = idCounter++;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public String toString() {
        return "id: " + id + "\nName: " + name + "\nAge: " + age + " years";
    }

    public void pet() {
        System.out.println("*petting*");
    }

    public void feed() {
        System.out.println("*feeding*");
    }
}
