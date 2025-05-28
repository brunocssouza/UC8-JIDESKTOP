package J2025_27_05.Abstract.Exercicio;

public class ClaHyuuga extends Cla {

    ClaHyuuga() {
        super("Hyuuga", "Hiashi");
    }

    @Override
    public void habilidadeEspecial() {
        System.out.println("A habilidade especial do clã " + this.nomeDoCla + " é Byakugan.");
    }
}
