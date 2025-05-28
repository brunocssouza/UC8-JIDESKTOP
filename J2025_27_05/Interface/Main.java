package J2025_27_05.Interface;

public class Main {
    public static void main(String[] args) {
        Guitarra guitarra = new Guitarra();
        Bateria bateria = new Bateria();

        guitarra.afinar();
        bateria.tocar();
    }
}
