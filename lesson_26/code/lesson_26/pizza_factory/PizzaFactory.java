package lesson_26.pizza_factory;

public class PizzaFactory {


    public Pizza orderPizza(String type) {
        Pizza pizza;
        switch(type) {
            case "Hawaii": pizza = new Hawaii(); break;
            case "Salami": pizza = new Salami(); break;
            case "Mozzarella": pizza = new Mozzarella(); break;
            default: pizza = null;
        }
        return pizza;
    }
}
