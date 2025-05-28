package J2025_27_05.Interface;

public class Bateria implements InstrumentoMusical {
    @Override
    public void tocar() {
        System.out.println("Bateria está tocando...");
    }

    @Override
    public void afinar() {
        System.out.println("Bateria está sendo afinada...");
    }
}
