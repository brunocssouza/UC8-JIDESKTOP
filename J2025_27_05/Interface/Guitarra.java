package J2025_27_05.Interface;

public class Guitarra implements InstrumentoMusical {

    @Override
    public void tocar() {
        System.out.println("Guitarra está tocando...");
    }

    @Override
    public void afinar() {
        System.out.println("Guitarra está sendo afinada...");
    }
}
