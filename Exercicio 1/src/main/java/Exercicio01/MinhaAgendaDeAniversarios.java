package Exercicio01;

import java.util.ArrayList;

public class MinhaAgendaDeAniversarios implements AgendaDeAniversarios {

    private final ArrayList<Aniversariante> aniversariantes;

    public MinhaAgendaDeAniversarios() {
        aniversariantes = new ArrayList<>();
    }

    @Override
    public void adicionarAniversariante(String nome, int dia, int mes) {
        Aniversariante novoAniversariante = new Aniversariante(nome, dia, mes);
        aniversariantes.add(novoAniversariante);
    }

    @Override
    public ArrayList<String> obterAniversariantesDoDia(int dia, int mes) {
        ArrayList<String> nomesEncontrados = new ArrayList<>();
        DataAniversario dataProcurada = new DataAniversario(dia, mes);

        for (Aniversariante aniversariante : aniversariantes) {
            if (aniversariante.getDataAniversario().equals(dataProcurada)) {
                nomesEncontrados.add(aniversariante.getNome());
            }
        }

        return nomesEncontrados;
    }

    @Override
    public void removerAniversariante(String nomeAniversariante) {
        for (int i = aniversariantes.size() - 1; i >= 0; i--) {
            Aniversariante aniversariante = aniversariantes.get(i);

            if (aniversariante.getNome().equals(nomeAniversariante)) {
                aniversariantes.remove(i);
            }
        }
    }
}

