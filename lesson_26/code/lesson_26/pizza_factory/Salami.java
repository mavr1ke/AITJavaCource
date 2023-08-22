package lesson_26.pizza_factory;

public class Salami extends Pizza{
    private final static String TYPE = "Pizza Salami";
    public Salami() {
        super(TYPE);
    }

    @Override
    protected void prepare() {
        System.out.println("Preparing pizza with salami");
    }
}
