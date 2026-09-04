package Exercicio02;

public class Gerente extends FuncionarioCLT {
    private int tamanhoEquipe;
    private double percentualBonus;

    public Gerente(String nome, String matricula, double salarioBase, String dataAdmissao,
                   double valeTransporte, double valeAlimentacao,
                   int tamanhoEquipe, double percentualBonus) {
        super(nome, matricula, salarioBase, dataAdmissao, valeTransporte, valeAlimentacao);
        this.tamanhoEquipe = tamanhoEquipe;
        this.percentualBonus = percentualBonus;
    }

    public int getTamanhoEquipe() {
        return tamanhoEquipe;
    }

    public void setTamanhoEquipe(int tamanhoEquipe) {
        this.tamanhoEquipe = tamanhoEquipe;
    }

    public double getPercentualBonus() {
        return percentualBonus;
    }

    public void setPercentualBonus(double percentualBonus) {
        this.percentualBonus = percentualBonus;
    }

    @Override
    public double calcularSalario() {
        // Aceita percentual como 0.20 ou 20.0
        double taxa = this.percentualBonus > 1.0 ? this.percentualBonus / 100.0 : this.percentualBonus;
        double bonus = getSalarioBase() * taxa;
        return super.calcularSalario() + bonus;
    }

    @Override
    public double calcularDesconto() {
        double desconto = super.calcularDesconto();
        if (this.tamanhoEquipe > 10) {
            desconto += 100.0;
        }
        return desconto;
    }
}
