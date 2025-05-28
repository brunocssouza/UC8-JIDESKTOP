package J2025_27_05.Abstract;

public abstract class Mobilia {
    protected String cor;
    protected String material;

    Mobilia(String cor, String material) {
        this.cor = cor;
        this.material = material;
    }

    // Um metodo abstract OBRIGA os filhos dessa classe a criar seu próprio método 'montar'.
    public abstract void montar();

    public void desmontar() {
        System.out.println("A mobilia foi desmontada.");
    }
}
