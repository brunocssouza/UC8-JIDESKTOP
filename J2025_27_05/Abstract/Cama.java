package J2025_27_05.Abstract;

public class Cama extends Mobilia {

    public Cama(String cor, String material) {
        super(cor, material);
    }

    @Override
    public void montar() {
        System.out.println("Montando cama...");
    }
}
