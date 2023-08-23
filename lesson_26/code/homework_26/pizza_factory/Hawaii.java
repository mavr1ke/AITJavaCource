package homework_26.pizza_factory;

public class Hawaii extends Pizza {

    private final static String TYPE = "Pizza Hawaii";

    public Hawaii() {
        super(TYPE);
    }

    @Override
    protected void prepare() {
        System.out.println("Preparing pizza with pineapples");
    }
}
