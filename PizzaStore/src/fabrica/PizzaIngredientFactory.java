package fabrica;

import ingredientes.Massa;
import ingredientes.Molho;
import ingredientes.Queijo;

public interface PizzaIngredientFactory {

    Massa criarMassa();

    Molho criarMolho();

    Queijo criarQueijo();
}