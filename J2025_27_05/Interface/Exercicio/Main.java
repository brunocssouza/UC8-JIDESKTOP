package J2025_27_05.Interface.Exercicio;

public class Main {
    public static void main(String[] args) {

        CartaoCredito cartao = new CartaoCredito("1234567891234567", 4323);
        Paypal paypal = new Paypal("bruno@gmail.com");

        // Informações do Cartão de Crédito
        System.out.println("================ Cartão de Crédito ================");
        cartao.processarPagamento(32.55);
        System.out.println("Últimos 4 digitos do cartão: " + cartao.obterDetalhes());

        // Informações do Paypal
        System.out.println("\n====================== Paypal ======================");
        paypal.processarPagamento(78.99);
        System.out.println("E-mail vinculado a compra: " + paypal.obterDetalhes());

    }

}
