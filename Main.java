public class Main {
    public static void main(String[] args) {

        Treino treino1 = new Musculacao(
                "Musculação membros inferiores",
                60,
                "Intermediário",
                "Pernas",
                4
        );

        Treino treino2 = new AulaColetiva(
                "Jump",
                45,
                "Iniciante",
                "Lucas",
                20
        );

        Aluno aluno = new Aluno(
                "Maria Oliveira",
                "987.654.321-00",
                "15/03/1995",
                65.0,
                1.68,
                "Sem restrições médicas"
        );

        aluno.adicionarTreino(treino1);
        aluno.adicionarTreino(treino2);

        Plano plano = new PlanoMensal("01/04/2025");

        RelatorioAluno relatorio = new RelatorioAluno(aluno, plano);

        relatorio.emitir();
    }
}