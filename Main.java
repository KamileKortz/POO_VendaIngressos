public class Main {
    public static void main(String[] args) {

        IngressoPadrao ingresso1 = new IngressoPadrao(50.0);
        System.out.println("Valor do Ingresso Padrão: R$ " + ingresso1.consultarValor());

        System.out.println();

        IngressoVIP ingresso2 = new IngressoVIP(50.0, 30.0);
        System.out.println("Valor Total do VIP: R$ " + ingresso2.consultarValor());
        ingresso2.mostrarValoresAdicionais();

        System.out.println();

        IngressoCamaroteVIP ingresso3 = new IngressoCamaroteVIP(50.0, 50.0, "Setor Azul - Cadeira 5");
        System.out.println("Valor Total do Camarote VIP: R$ " + ingresso3.consultarValor());
        ingresso3.mostrarValoresAdicionais();
        ingresso3.exibirLocalizacao();
    }
}