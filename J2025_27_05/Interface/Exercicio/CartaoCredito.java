package J2025_27_05.Interface.Exercicio;

public class CartaoCredito implements Pagamento {
    String numeroCartao;
    int codigoSeguranca;

    public CartaoCredito(String numeroCartao, int codigoSeguranca) {
        this.numeroCartao = numeroCartao;
        this.codigoSeguranca = codigoSeguranca;
    }

    @Override
    public void processarPagamento(double valor) {
        System.out.println("Pagamento de R$"+ valor +" processado via Cartão de Crédito");
    }

    @Override
    public String obterDetalhes() {
        // O método 'substring' corta uma string até o índice indicado como parâmetro.
        return numeroCartao.substring(numeroCartao.length() - 4);
    }
}
