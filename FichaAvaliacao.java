public class FichaAvaliacao {
    private double peso;
    private double altura;
    private String observacoes;

    public FichaAvaliacao(double peso, double altura, String observacoes) {
        this.peso = peso;
        this.altura = altura;
        this.observacoes = observacoes;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public void exibirFicha() {
        System.out.println("Peso          : " + peso + " kg");
        System.out.println("Altura        : " + altura + " m");
        System.out.println("Observações   : " + observacoes);
    }
}