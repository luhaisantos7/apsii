package Exercicio02;

public class Diretor extends Gerente {
    private double participacaoLucros;

    public Diretor(String nome, String matricula, double salarioBase, String dataAdmissao,
                   double valeTransporte, double valeAlimentacao,
                   int tamanhoEquipe, double percentualBonus,
                   double participacaoLucros) {
        super(nome, matricula, salarioBase, dataAdmissao, valeTransporte, valeAlimentacao, tamanhoEquipe, percentualBonus);
        this.participacaoLucros = participacaoLucros;
    }

    public double getParticipacaoLucros() {
        return participacaoLucros;
    }

    public void setParticipacaoLucros(double participacaoLucros) {
        this.participacaoLucros = participacaoLucros;
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + this.participacaoLucros;
    }
}
