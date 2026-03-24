public class IngressoCamaroteInferior extends Ingresso implements ComLocalizacao {
    String localizacao;

    public IngressoCamaroteInferior(double valorBase, String localizacao) {
        super(valorBase);
        this.localizacao = localizacao;
    }

    public void exibirLocalizacao() {
        System.out.println("A sua localização no Camarote Inferior é: " + this.localizacao);
    }
}