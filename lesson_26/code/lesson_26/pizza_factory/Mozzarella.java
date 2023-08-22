package lesson_26.pizza_factory;

public class Mozzarella extends Pizza{

    private final static String TYPE = "Pizza Mozzarella";
    public Mozzarella() {
        super(TYPE);
    }

    @Override
    protected void prepare() {
        System.out.println("Preparing pizza with mozzarella cheese");
    }
}
