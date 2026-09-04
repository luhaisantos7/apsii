package Exercicio01;

import java.util.Objects;

public class Aniversariante {

    private String nome;
    private DataAniversario dataAniversario;

    public Aniversariante(String nome, int dia, int mes) {
        this(nome, new DataAniversario(dia, mes));
    }

    public Aniversariante(String nome, DataAniversario dataAniversario) {
        this.nome = nome;
        this.dataAniversario = dataAniversario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public DataAniversario getDataAniversario() {
        return dataAniversario;
    }

    public void setDataAniversario(DataAniversario dataAniversario) {
        this.dataAniversario = dataAniversario;
    }

    @Override
    public boolean equals(Object outroObjeto) {
        if (this == outroObjeto) {
            return true;
        }
        if (!(outroObjeto instanceof Aniversariante)) {
            return false;
        }

        Aniversariante outroAniversariante = (Aniversariante) outroObjeto;
        return Objects.equals(nome, outroAniversariante.nome)
                && Objects.equals(dataAniversario, outroAniversariante.dataAniversario);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, dataAniversario);
    }

    @Override
    public String toString() {
        return nome + " - " + dataAniversario;
    }
}

