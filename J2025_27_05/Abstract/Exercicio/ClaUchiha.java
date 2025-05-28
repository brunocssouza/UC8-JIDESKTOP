package J2025_27_05.Abstract.Exercicio;

public class ClaUchiha extends Cla {

    ClaUchiha() {
        super("Uchiha", "Sasuke");
    }

    @Override
    public void habilidadeEspecial() {
        System.out.println("A habilidade especial do clã " + this.nomeDoCla + " é Sharingan.");
    }
}
