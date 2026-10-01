public class RelatorioAluno {
    private Aluno aluno;
    private Plano plano;

    public RelatorioAluno(Aluno aluno, Plano plano) {
        this.aluno = aluno;
        this.plano = plano;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Plano getPlano() {
        return plano;
    }

    public void setPlano(Plano plano) {
        this.plano = plano;
    }

    public void emitir() {
        System.out.println("========================================");
        System.out.println("           RELATÓRIO DO ALUNO");
        System.out.println("========================================");

        System.out.println("Nome          : " + aluno.getNome());
        System.out.println("CPF           : " + aluno.getCpf());
        System.out.println("Nascimento    : " + aluno.getDataNascimento());

        System.out.println("----------------------------------------");
        System.out.println("FICHA DE AVALIAÇÃO");
        aluno.getFichaAvaliacao().exibirFicha();

        System.out.println("----------------------------------------");
        System.out.println("TREINOS MATRICULADOS");
        aluno.listarTreinos();

        System.out.println("----------------------------------------");
        System.out.println("PLANO CONTRATADO");
        System.out.println("Tipo          : " + plano.getTipo());
        System.out.println("Início        : " + plano.getDataInicio());
        System.out.printf("Total a pagar : R$ %.2f%n", plano.calcularTotal());

        System.out.println("========================================");
    }
}