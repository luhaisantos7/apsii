package pizza;

import fabrica.NYPizzaIngredientFactory;

public class PizzaTest {

    public static void main(String[] args) {

        NYPizzaIngredientFactory factory =
                new NYPizzaIngredientFactory();

        Pizza pizza = new Pizza();

        pizza.preparar(factory);
    }
}