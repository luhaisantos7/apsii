package Exercicio02;

public class TesteFuncionarios {

    public static void main(String[] args) {
        // 1. Funcionario: Ana Costa | F001 | 2500 | 01/03/2020
        Funcionario func = new Funcionario("Ana Costa", "F001", 2500.0, "01/03/2020");

        // 2. FuncionarioCLT: Bruno Reis | C001 | 3000 | 10/06/2021 | VT: 220 | VA: 400
        FuncionarioCLT clt = new FuncionarioCLT("Bruno Reis", "C001", 3000.0, "10/06/2021", 220.0, 400.0);

        // 3. Gerente: Carla Mendes | G001 | 8000 | 15/01/2018 | VT: 300 | VA: 500 | Equipe: 12 | Bônus: 20%
        Gerente gerente = new Gerente("Carla Mendes", "G001", 8000.0, "15/01/2018", 300.0, 500.0, 12, 0.20);

        // 4. Estagiario: Diego Alves | E001 | 0 | 05/08/2024 | Bolsa: 1500 | Carga horária: 20
        Estagiario estagiario = new Estagiario("Diego Alves", "E001", 0.0, "05/08/2024", 1500.0, 20);

        // 5. Diretor (desafio opcional)
        Diretor diretor = new Diretor("Eduardo Lima", "D001", 12000.0, "10/01/2015", 350.0, 600.0, 25, 0.30, 5000.0);

        // Exibição de cada funcionário com System.out.println() conforme solicitado
        System.out.println("=== TESTE DE FUNCIONÁRIOS ===");
        System.out.println(func);
        System.out.println(clt);
        System.out.println(gerente);
        System.out.println(estagiario);

        System.out.println("\n=== DESAFIO OPCIONAL (DIRETOR) ===");
        System.out.println(diretor);

        // Verificação automática dos cálculos para garantir integridade
        verificarCalculos(func, 2500.0, 200.0, 2300.0, "Funcionario");
        verificarCalculos(clt, 3620.0, 290.0, 3330.0, "FuncionarioCLT");
        verificarCalculos(gerente, 10400.0, 790.0, 9610.0, "Gerente");
        verificarCalculos(estagiario, 1500.0, 0.0, 1500.0, "Estagiario");
        verificarCalculos(diretor, 21550.0, 1110.0, 20440.0, "Diretor");

        System.out.println("\nTodos os cálculos foram verificados e validados com sucesso!");
    }

    private static void verificarCalculos(Funcionario f, double salEsperado, double descEsperado, double liqEsperado, String tipo) {
        double delta = 0.001;
        if (Math.abs(f.calcularSalario() - salEsperado) > delta) {
            throw new AssertionError(tipo + " com salário incorreto: " + f.calcularSalario() + " esperado: " + salEsperado);
        }
        if (Math.abs(f.calcularDesconto() - descEsperado) > delta) {
            throw new AssertionError(tipo + " com desconto incorreto: " + f.calcularDesconto() + " esperado: " + descEsperado);
        }
        double liquido = f.calcularSalario() - f.calcularDesconto();
        if (Math.abs(liquido - liqEsperado) > delta) {
            throw new AssertionError(tipo + " com líquido incorreto: " + liquido + " esperado: " + liqEsperado);
        }
    }
}
