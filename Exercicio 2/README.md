# Exercício 2 - Cálculo de salário de funcionários com herança

Solução da Lista de Exercícios 02 da disciplina **Análise e Projeto de Sistemas II** (UNIPÊ).

## Diagrama de classes

```mermaid
classDiagram
    class Funcionario {
        -String nome
        -String matricula
        -double salarioBase
        -String dataAdmissao
        +Funcionario(nome, matricula, salarioBase, dataAdmissao)
        +getNome() String
        +getMatricula() String
        +getSalarioBase() double
        +getDataAdmissao() String
        +calcularSalario() double
        +calcularDesconto() double
        +toString() String
    }

    class FuncionarioCLT {
        -double valeTransporte
        -double valeAlimentacao
        +FuncionarioCLT(nome, matricula, salarioBase, dataAdmissao, valeTransporte, valeAlimentacao)
        +getValeTransporte() double
        +setValeTransporte(double valeTransporte) void
        +getValeAlimentacao() double
        +setValeAlimentacao(double valeAlimentacao) void
        +calcularSalario() double
        +calcularDesconto() double
    }

    class Gerente {
        -int tamanhoEquipe
        -double percentualBonus
        +Gerente(nome, matricula, salarioBase, dataAdmissao, valeTransporte, valeAlimentacao, tamanhoEquipe, percentualBonus)
        +getTamanhoEquipe() int
        +setTamanhoEquipe(int tamanhoEquipe) void
        +getPercentualBonus() double
        +setPercentualBonus(double percentualBonus) void
        +calcularSalario() double
        +calcularDesconto() double
    }

    class Estagiario {
        -double valorBolsaAuxilio
        -int cargaHorariaSemanal
        +Estagiario(nome, matricula, salarioBase, dataAdmissao, valorBolsaAuxilio, cargaHorariaSemanal)
        +getValorBolsaAuxilio() double
        +setValorBolsaAuxilio(double valorBolsaAuxilio) void
        +getCargaHorariaSemanal() int
        +setCargaHorariaSemanal(int cargaHorariaSemanal) void
        +calcularSalario() double
        +calcularDesconto() double
    }

    class Diretor {
        -double participacaoLucros
        +Diretor(nome, matricula, salarioBase, dataAdmissao, valeTransporte, valeAlimentacao, tamanhoEquipe, percentualBonus, participacaoLucros)
        +getParticipacaoLucros() double
        +setParticipacaoLucros(double participacaoLucros) void
        +calcularSalario() double
    }

    Funcionario <|-- FuncionarioCLT : herda
    FuncionarioCLT <|-- Gerente : herda
    Gerente <|-- Diretor : herda
    Funcionario <|-- Estagiario : herda
```

## Regras Implementadas

1. **Funcionario (Classe base)**:
   - `calcularSalario()`: retorna o salário-base.
   - `calcularDesconto()`: retorna 8% do salário-base.
   - `toString()`: formata nome, matrícula, salário bruto, desconto e salário líquido.

2. **FuncionarioCLT**:
   - Herda de `Funcionario`.
   - `calcularSalario()`: `super.calcularSalario() + valeTransporte + valeAlimentacao`.
   - `calcularDesconto()`: `super.calcularDesconto() + 50.0`.

3. **Gerente**:
   - Herda de `FuncionarioCLT`.
   - `calcularSalario()`: `super.calcularSalario() + (salarioBase * percentualBonus)`.
   - `calcularDesconto()`: `super.calcularDesconto()` + R$ 100,00 se `tamanhoEquipe > 10`.

4. **Estagiario**:
   - Herda diretamente de `Funcionario`.
   - `calcularSalario()`: `valorBolsaAuxilio`.
   - `calcularDesconto()`: `0.0`.

5. **Diretor (Desafio opcional)**:
   - Herda de `Gerente`.
   - `calcularSalario()`: `super.calcularSalario() + participacaoLucros`.

## Como executar o teste

Execute a classe `TesteFuncionarios`, localizada em `src/test/java/Exercicio02`. Ela instancia cada tipo de funcionário com os dados do exercício e valida os valores esperados.
