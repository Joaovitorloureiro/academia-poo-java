public class PlanoMensal extends Plano {

    public PlanoMensal(String dataInicio) {
        super(dataInicio);
    }

    @Override
    public double calcularTotal() {
        return 120.00;
    }

    @Override
    public String getTipo() {
        return "Plano Mensal";
    }
}