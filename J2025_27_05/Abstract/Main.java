package J2025_27_05.Abstract;

public class Main {
    public static void main(String[] args) {
        Sofa sofa = new Sofa("Azul", "Madeira");
        Cama cama = new Cama("Marrom", "Concreto");

        sofa.montar();
        cama.montar();
        sofa.desmontar();
        cama.desmontar();
    }
}
