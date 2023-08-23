package homework_26.pizza_factory;

public class PizzaFactory {


    public Pizza orderPizza(String type) {
        Pizza pizza;
        switch(type) {
            case "1": pizza = new Hawaii(); break;
            case "2": pizza = new Salami(); break;
            case "3": pizza = new Mozzarella(); break;
            default: pizza = null;
        }
        return pizza;
    }
}
