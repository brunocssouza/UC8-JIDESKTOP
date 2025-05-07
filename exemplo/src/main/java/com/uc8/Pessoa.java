/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uc8;

/**
 *
 * @author BRUNOCESARSILVADESOU
 */
public class Pessoa {
    String meuNome = "Bruno";
    char minhaInicial = 'B';
    int minhaIdade = 23;
    double minhaAltura = 1.70;
    boolean souEstudante = true;
    
    public void verficarIdade() {
        if (this.minhaIdade >= 18) {
            System.out.println("Adulto");
        } else {
            System.out.println("Jovem");
        }
    }
}
