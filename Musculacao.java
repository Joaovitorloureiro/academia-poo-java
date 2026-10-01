public class Musculacao extends Treino {
    private String grupoMuscular;
    private int series;

    public Musculacao(String nome, int duracao, String nivel, String grupoMuscular, int series) {
        super(nome, duracao, nivel);
        this.grupoMuscular = grupoMuscular;
        this.series = series;
    }

    public String getGrupoMuscular() {
        return grupoMuscular;
    }

    public void setGrupoMuscular(String grupoMuscular) {
        this.grupoMuscular = grupoMuscular;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    @Override
    public String descricao() {
        return "- " + getNome() + " | Duração: " + getDuracao() + " min | Nível: " + getNivel()
                + "\n  Grupo muscular: " + grupoMuscular + " | Séries: " + series;
    }
}