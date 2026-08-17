package Exercicio01;

import java.util.ArrayList;

public class TesteAgenda {

    public static void main(String[] args) {
        testarEqualsDeAniversariante();
        testarAgenda();
        System.out.println("Todos os testes passaram.");
    }

    private static void testarEqualsDeAniversariante() {
        Aniversariante primeiro = new Aniversariante("Ana", 10, 5);
        Aniversariante segundo = new Aniversariante("Ana", new DataAniversario(10, 5));
        Aniversariante terceiro = new Aniversariante("Ana", 11, 5);

        verificar(primeiro.equals(segundo), "Pessoas com mesmo nome e data devem ser iguais.");
        verificar(!primeiro.equals(terceiro), "Pessoas com datas diferentes não devem ser iguais.");
    }

    private static void testarAgenda() {
        MinhaAgendaDeAniversarios agenda = new MinhaAgendaDeAniversarios();
        agenda.adicionarAniversariante("Ana", 10, 5);
        agenda.adicionarAniversariante("Carlos", 10, 5);
        agenda.adicionarAniversariante("Bruno", 20, 8);

        ArrayList<String> aniversariantesDoDia = agenda.obterAniversariantesDoDia(10, 5);
        verificar(aniversariantesDoDia.size() == 2, "A consulta deveria encontrar duas pessoas.");
        verificar(aniversariantesDoDia.contains("Ana"), "A consulta deveria encontrar Ana.");
        verificar(aniversariantesDoDia.contains("Carlos"), "A consulta deveria encontrar Carlos.");

        agenda.removerAniversariante("Ana");
        aniversariantesDoDia = agenda.obterAniversariantesDoDia(10, 5);
        verificar(!aniversariantesDoDia.contains("Ana"), "Ana deveria ter sido removida.");
    }

    private static void verificar(boolean condicao, String mensagem) {
        if (!condicao) {
            throw new AssertionError(mensagem);
        }
    }
}
