package lesson_26.pizza_factory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
проект " Pizza Factory" .
     Нужно создать фабрику по производству пиццы. Фабрика должна уметь готовить такие виды пиццы:
     Гавайи, Салями, Моцарелла. Каждый вид пиццы должен уметь :
     подготавливаться( накладывать ингредиенты, и т.д)
     печься
     упаковываться

     в каждом случае должно быть понятно о каком виде пиццы идет речь.
      В классе Main  не должен создаваться новый обьект пиццы, а из него должен поступать заказ на изготовление нужного
      вида пиццы в класс PizzaFactory, который должен выбрать нужную пиццу для изготовления

      Алгоритм реализации:

      1. Нужно создать родительский абстрактный класс Pizza и три дочерних класса.
      2. Возможно не все методы ролительского класса должны быть абстрактными, а только те, реализация которых в дочерних
         классах различна.
      3. Создать класс PizzaFactory,  в котором будет осуществляться создание нового обьекта пицца в зависимости от выбора
         заказчика.( Возможно, стоит  использовать в этом случае  Switch )
*/
        PizzaFactory pizzaFactory = new PizzaFactory();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите тип пиццы (Hawaii, Salami, Mozzarella):");
        String chosenType = scanner.nextLine();

        switch (chosenType.toLowerCase()) {
            case "hawaii":
            case "salami":
            case "mozzarella":
                Pizza pizza = pizzaFactory.orderPizza(chosenType);
                pizza.orderPizza();
                break;
            default:
                System.out.println("Некорректный выбор. Пожалуйста, выберите из предложенных вариантов.");
        }


    }


}
