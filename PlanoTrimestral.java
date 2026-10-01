public class PlanoTrimestral extends Plano {

    public PlanoTrimestral(String dataInicio) {
        super(dataInicio);
    }

    @Override
    public double calcularTotal() {
        return 300.00;
    }

    @Override
    public String getTipo() {
        return "Plano Trimestral";
    }
}