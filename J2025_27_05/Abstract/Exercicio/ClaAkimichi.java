package J2025_27_05.Abstract.Exercicio;

public class ClaAkimichi extends Cla {

    ClaAkimichi() {
        super("Akimichi", "Chouza");
    }

    @Override
    public void habilidadeEspecial() {
        System.out.println("A habilidade especial do clã " + this.nomeDoCla + " é Ampliação Corporal.");
    }
}
