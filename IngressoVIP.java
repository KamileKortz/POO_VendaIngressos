public class IngressoVIP extends Ingresso implements ComTaxa {
    double taxaVIP;

    public IngressoVIP(double valorBase, double taxaVIP) {
        super(valorBase);
        this.taxaVIP = taxaVIP;
    }

    @Override
    public double consultarValor() {
        return this.valorBase + this.taxaVIP;
    }

    public void mostrarValoresAdicionais() {
        System.out.println("O valor adicional (Taxa VIP) é de: R$ " + this.taxaVIP);
    }
}