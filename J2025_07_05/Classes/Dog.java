/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J2025_07_05.Classes;

/**
 *
 * @author BRUNOCESARSILVADESOU
 */
public class Dog extends Animal {
    
    private String breed;
    
    public Dog(String name, String species, double weight, String breed) {
        super(name, species, weight);
        this.breed = breed;
    }
    
    @Override
    public void emitirSom() {
        System.out.println("O cachorro latiu.");
    }
    
}
