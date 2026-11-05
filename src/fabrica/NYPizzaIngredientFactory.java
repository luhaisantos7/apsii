package fabrica;

import ingredientes.*;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Massa criarMassa() {
        return new MassaFina();
    }

    @Override
    public Molho criarMolho() {
        return new MolhoMarinara();
    }

    @Override
    public Queijo criarQueijo() {
        return new QueijoReggiano();
    }
}