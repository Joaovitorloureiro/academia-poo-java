public class AulaColetiva extends Treino {
    private String instrutor;
    private int maxParticipantes;

    public AulaColetiva(String nome, int duracao, String nivel, String instrutor, int maxParticipantes) {
        super(nome, duracao, nivel);
        this.instrutor = instrutor;
        this.maxParticipantes = maxParticipantes;
    }

    public String getInstrutor() {
        return instrutor;
    }

    public void setInstrutor(String instrutor) {
        this.instrutor = instrutor;
    }

    public int getMaxParticipantes() {
        return maxParticipantes;
    }

    public void setMaxParticipantes(int maxParticipantes) {
        this.maxParticipantes = maxParticipantes;
    }

    @Override
    public String descricao() {
        return "- " + getNome() + " | Duração: " + getDuracao() + " min | Nível: " + getNivel()
                + "\n  Instrutor: " + instrutor + " | Máx. participantes: " + maxParticipantes;
    }
}