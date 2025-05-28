package J2025_27_05.Abstract;

public class Sofa extends Mobilia {

    public Sofa(String cor, String material) {
        super(cor, material);
    }

    @Override
    public void montar() {
        System.out.println("Montando sofa...");
    }
}
