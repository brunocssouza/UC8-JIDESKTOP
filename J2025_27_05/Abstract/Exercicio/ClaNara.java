package J2025_27_05.Abstract.Exercicio;

public class ClaNara extends Cla {

    ClaNara() {
        super("Nara", "Shikamaru");
    }

    @Override
    public void habilidadeEspecial() {
        System.out.println("A habilidade especial do clã " + this.nomeDoCla + " é Manipulação de Sombras.");
    }
}
