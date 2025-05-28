package J2025_27_05.Interface.Exercicio;

public class Paypal implements Pagamento {
    String email;

    public Paypal(String email) {
        this.email = email;
    }

    @Override
    public void processarPagamento(double valor) {
        System.out.println("Pagamento de R$"+ valor +" processado via PayPal");
    }

    @Override
    public String obterDetalhes() {
        return this.email;
    }
}
