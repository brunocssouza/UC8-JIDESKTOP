package J2025_07_05.Classes;


public class Main {
    public static void main(String[] args) {
        Animal myAnimal = new Animal("Jonas", "Leão", 190);
        Dog myDog = new Dog("Bidu", "Cachorro", 20, "Vira-Lata");
        
        myAnimal.emitirSom();
        myDog.emitirSom();
    }
}

