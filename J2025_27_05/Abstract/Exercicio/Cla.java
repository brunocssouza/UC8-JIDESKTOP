package J2025_27_05.Abstract.Exercicio;

public abstract class Cla {
    protected String nomeDoCla;
    protected String lider;

    Cla(String nomeDoCla, String lider) {
        this.nomeDoCla = nomeDoCla;
        this.lider = lider;
    }

    public abstract void habilidadeEspecial();

    public void exibirDetalhes() {
        System.out.println("Nome do clã: " + this.nomeDoCla);
        System.out.println("Lider do clã: " + this.lider);
    }
}
