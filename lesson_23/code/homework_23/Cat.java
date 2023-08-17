package homework_23;

public class Cat extends HomeAnimal {

    private boolean isWoolen;
    private boolean isLazy;
    private Collar collar;

    public Cat(String name, byte age, boolean isWoolen, boolean isLazy, Collar collar) {
        super(name, age);
        this.isWoolen = isWoolen;
        this.isLazy = isLazy;
        this.collar = collar;
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

    public String toString() {
        return super.toString() + "\nIs woolen: " + isWoolen + "\nIs lazy: " + isLazy + collar.toString();
    }

    public void meow() {
        System.out.println("meow");
    }
}
