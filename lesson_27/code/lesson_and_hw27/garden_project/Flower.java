package lesson_and_hw27.garden_project;

public class Flower extends Plant {
    private static final int FLOWER_GROW_PER_SEASON = 2;

    public Flower(String name, int height, int age) {
        super(name, height, age);
    }

    @Override
    public void doSummer() {
        System.out.println(getName() + " is blooming in Summer - " + getHeight());
    }

    @Override
    public void doAutumn() {
        setHeight(getHeight()/2);
        System.out.println(getName() + " is getting cut in Autumn - " + getHeight());
    }

    @Override
    public int getGrowPerSeason() {
        return FLOWER_GROW_PER_SEASON;
    }
}
