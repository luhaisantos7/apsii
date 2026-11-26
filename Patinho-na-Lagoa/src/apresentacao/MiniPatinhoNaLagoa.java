package apresentacao;

import patos.Duck;
import patos.MallardDuck;

public class MiniPatinhoNaLagoa {

    public static void main(String[] args) {

        Duck pato = new MallardDuck();

        pato.performQuack();
        pato.performFly();
        pato.swim();
    }
}