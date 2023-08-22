package lesson_26.pizza_factory;

public abstract class Pizza {

    private final String type;

    public Pizza(String type) {
         this.type = type;
    }

    protected abstract void prepare();

    private void bake() {
        System.out.println("Baking " + type);
    }

    private void pack() {
        System.out.println("Packing " + type);
    }
    public void orderPizza() {
        prepare();
        bake();
        pack();
        System.out.println("Your pizza is done");
    }
}
