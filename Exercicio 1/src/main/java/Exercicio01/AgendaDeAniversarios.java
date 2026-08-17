package Exercicio01;

import java.util.ArrayList;

public interface AgendaDeAniversarios {

    // Adiciona um novo aniversariante.
    void adicionarAniversariante(String nome, int dia, int mes);

    // Retorna os nomes dos aniversariantes do dia e mês informados.
    ArrayList<String> obterAniversariantesDoDia(int dia, int mes);

    // Remove todos os aniversariantes que tenham o nome informado.
    void removerAniversariante(String nomeAniversariante);
}

