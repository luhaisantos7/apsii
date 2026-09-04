package exercicio3;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        Livro livro = new Livro();
        CD cd = new CD();

        System.out.println("Digite o nome do livro:");
        livro.setNome(entrada.nextLine());

        System.out.println("Digite o preco do livro:");
        livro.setPreco(entrada.nextDouble());
        entrada.nextLine();

        System.out.println("Digite o autor:");
        livro.setAutor(entrada.nextLine());

        System.out.println("Digite o nome do CD:");
        cd.setNome(entrada.nextLine());

        System.out.println("Digite o preco do CD:");
        cd.setPreco(entrada.nextDouble());

        System.out.println("Digite o numero de faixas:");
        cd.setNumFaixas(entrada.nextInt());

        cd.exibeInformacoes();

        entrada.close();
    }
}