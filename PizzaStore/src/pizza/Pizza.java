package pizza;

import fabrica.PizzaIngredientFactory;
import ingredientes.*;

public class Pizza {

    Massa massa;
    Molho molho;
    Queijo queijo;

    public void preparar(PizzaIngredientFactory factory) {

        System.out.println("Preparando a pizza...");

        massa = factory.criarMassa();
        molho = factory.criarMolho();
        queijo = factory.criarQueijo();

        System.out.println("Usando massa: " + massa.getClass().getSimpleName());
        System.out.println("Usando molho: " + molho.getClass().getSimpleName());
        System.out.println("Usando queijo: " + queijo.getClass().getSimpleName());
    }
}