# Exercício 1 - Agenda de aniversários

Solução da Lista de Exercícios 01 da disciplina Análise e Projeto de Sistemas II.

## Diagrama de classes

```mermaid
classDiagram
    class AgendaDeAniversarios {
        <<interface>>
        +adicionarAniversariante(nome, dia, mes) void
        +obterAniversariantesDoDia(dia, mes) ArrayList~String~
        +removerAniversariante(nomeAniversariante) void
    }

    class MinhaAgendaDeAniversarios {
        -ArrayList~Aniversariante~ aniversariantes
        +adicionarAniversariante(nome, dia, mes) void
        +obterAniversariantesDoDia(dia, mes) ArrayList~String~
        +removerAniversariante(nomeAniversariante) void
    }

    class Aniversariante {
        -String nome
        -DataAniversario dataAniversario
        +Aniversariante(nome, dia, mes)
        +Aniversariante(nome, dataAniversario)
        +equals(outroObjeto) boolean
    }

    class DataAniversario {
        -int dia
        -int mes
        +DataAniversario(dia, mes)
        +equals(outraData) boolean
    }

    AgendaDeAniversarios <|.. MinhaAgendaDeAniversarios : implementa
    MinhaAgendaDeAniversarios "1" *-- "0..*" Aniversariante : guarda
    Aniversariante "1" *-- "1" DataAniversario : possui
```

## Como executar o teste

Execute a classe `TesteAgenda`, localizada em `src/test/java/Exercicio01`. Ela usa apenas recursos nativos do Java e verifica adição, consulta, remoção e igualdade.

