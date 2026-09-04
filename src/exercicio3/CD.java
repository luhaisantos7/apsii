package exercicio3;

public class CD extends Produto implements InfoGerais {

    private int numFaixas;

    public int getNumFaixas() {
        return numFaixas;
    }

    public void setNumFaixas(int numFaixas) {
        this.numFaixas = numFaixas;
    }

    public void exibeInformacoes() {
        System.out.println("Nome: " + getNome());
        System.out.println("Preco: " + getPreco());
        System.out.println("Numero de faixas: " + numFaixas);
    }
}