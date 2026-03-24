public class IngressoCamaroteVIP extends Ingresso implements ComTaxa, ComLocalizacao {
    double taxaVIP;
    String localizacao;

    public IngressoCamaroteVIP(double valorBase, double taxaVIP, String localizacao) {
        super(valorBase);
        this.taxaVIP = taxaVIP;
        this.localizacao = localizacao;
    }

    @Override
    public double consultarValor() {
        return this.valorBase + this.taxaVIP;
    }

    public void mostrarValoresAdicionais() {
        System.out.println("O valor adicional (Taxa VIP do Camarote) é de: R$ " + this.taxaVIP);
    }

    public void exibirLocalizacao() {
        System.out.println("A sua localização super chique no Camarote VIP é: " + this.localizacao);
    }
}