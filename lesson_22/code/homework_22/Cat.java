package homework_22;

public class Cat extends HomeAnimal{

    private boolean isWoolen;
    private boolean isLazy;

    public Cat(String name, byte age, boolean isWoolen, boolean isLazy) {
        super(name, age);
        this.isWoolen = isWoolen;
        this.isLazy = isLazy;
    }

    public boolean isWoolen() {
        return isWoolen;
    }

    public void setWoolen(boolean woolen) {
        isWoolen = woolen;
    }

    public boolean isLazy() {
        return isLazy;
    }

    public void setLazy(boolean lazy) {
        isLazy = lazy;
    }

    public void meow() {
        System.out.println("meow");
    }
}
