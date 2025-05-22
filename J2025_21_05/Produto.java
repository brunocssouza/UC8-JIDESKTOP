package J2025_21_05;

public class Produto {
    private String nome;
    private double preco;
    protected String tipo;

    Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public String getTipo() {
        return tipo;
    }
}
