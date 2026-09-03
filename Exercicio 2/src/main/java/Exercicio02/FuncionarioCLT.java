package Exercicio02;

public class FuncionarioCLT extends Funcionario {
    private double valeTransporte;
    private double valeAlimentacao;

    public FuncionarioCLT(String nome, String matricula, double salarioBase, String dataAdmissao,
                          double valeTransporte, double valeAlimentacao) {
        super(nome, matricula, salarioBase, dataAdmissao);
        this.valeTransporte = valeTransporte;
        this.valeAlimentacao = valeAlimentacao;
    }

    public double getValeTransporte() {
        return valeTransporte;
    }

    public void setValeTransporte(double valeTransporte) {
        this.valeTransporte = valeTransporte;
    }

    public double getValeAlimentacao() {
        return valeAlimentacao;
    }

    public void setValeAlimentacao(double valeAlimentacao) {
        this.valeAlimentacao = valeAlimentacao;
    }

    @Override
    public double calcularSalario() {
        // Considera o salário-base e os dois benefícios
        return super.calcularSalario() + this.valeTransporte + this.valeAlimentacao;
    }

    @Override
    public double calcularDesconto() {
        // Mantém o desconto calculado por Funcionario e acrescenta R$ 50,00
        return super.calcularDesconto() + 50.0;
    }
}
