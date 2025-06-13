/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J2025_12_06.RPG;

import java.util.ArrayList;

/**
 *
 * @author BRUNOCESARSILVADESOU
 */
public class Character {
    String name;
    String age;
    String function;
    String race;
    ArrayList<String> skills;
    
    public Character(String name, String age, String function, String race, ArrayList<String> skills) {
        this.name = name;
        this.age = age;
        this.function = function;
        this.race = race;
        this.skills = skills;
    }
}
