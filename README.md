# Academia — Atividade de POO (Java)

Atividade da disciplina **Programação Orientada a Objetos I** — Ciências da Computação, Universidade de Vila Velha (UVV).
Desenvolvido em dupla: João Vitor de Carvalho Loureiro e Murilo Cipriano Carvalho.

## O que o programa faz
Cadastra um aluno de academia com ficha de avaliação, treinos matriculados e plano contratado, e emite um relatório do aluno.

## Conceitos de POO aplicados
- **Classes abstratas e herança:** `Treino` → `Musculacao` e `AulaColetiva`; `Plano` → `PlanoMensal` e `PlanoTrimestral`.
- **Polimorfismo:** cada treino tem sua própria `descricao()` e cada plano seu próprio `calcularTotal()`.
- **Composição:** a `FichaAvaliacao` é criada junto com o `Aluno`.
- **Agregação:** o aluno guarda uma lista de treinos que existem independentemente dele.

## Como executar
Requisito: Java (JDK) instalado.

```bash
javac -encoding UTF-8 *.java
java Main
```

No VS Code: abra `Main.java` e clique em **Run** acima do método `main`.
