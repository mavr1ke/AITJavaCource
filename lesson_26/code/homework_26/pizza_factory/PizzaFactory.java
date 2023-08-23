package homework_26.pizza_factory;

public class PizzaFactory {


    public Pizza orderPizza(String type) {
        switch (type) {
            case "1":
                return new Hawaii();
            case "2":
                return new Salami();
            case "3":
                return new Mozzarella();
            default:
                return null;
        }
    }
}
