package lesson_22;

public class Person {

    private String name;
    private boolean isChild;
    private boolean isHaveSpecialRequirements;

    public Person(String name) {
        this.name = name;
    }

    public void move() {
        System.out.println("I can move");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isChild() {
        return isChild;
    }

    public void setChild(boolean child) {
        isChild = child;
    }

    public boolean isHaveSpecialRequirements() {
        return isHaveSpecialRequirements;
    }

    public void setHaveSpecialRequirements(boolean haveSpecialRequirements) {
        isHaveSpecialRequirements = haveSpecialRequirements;
    }
}
