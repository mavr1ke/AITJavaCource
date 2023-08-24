package lesson_and_hw27.garden_project;

public abstract class Plant {

    private final String name;
    private int height;
    private int age;

    public Plant(String name, int height, int age) {
        this.name = name;
        this.height = height;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    public int getAge() {
        return age;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void addYearToAge() {
        this.age++;
    }

    public abstract int getGrowPerSeason(); //  в дочерних классах будет возвращать рост за сезон

    public void doSpring() {
        addYearToAge(); // новый год начинается весной
        setHeight(getHeight() + getGrowPerSeason());
        System.out.println(getName() + " has grown in Spring - " + getHeight());
    }

    public abstract void doSummer();

    public abstract void doAutumn();

    public void doWinter() {
        System.out.println(getName() + " is not growing in Winter - " + getHeight());
    }

    public void seasonsForYear() {
        doSpring();
        doSummer();
        doAutumn();
        doWinter();
    }
}
