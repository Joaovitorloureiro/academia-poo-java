public abstract class Plano {
    private String dataInicio;

    public Plano(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public abstract double calcularTotal();

    public abstract String getTipo();
}