/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J2025_07_05.Scanner;
import java.util.Scanner;

/**
 *
 * @author BRUNOCESARSILVADESOU
 */
public class Input {
    
    public void inteiro() {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite um numero: ");
        int num1 = sc.nextInt();
        System.out.println("Digite outro numero: ");
        int num2 = sc.nextInt();
        
        int soma = num1+num2;
        System.out.println("A soma dos digitos inseridos é " + soma);
        
    }
    
    public void string() {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite seu nome: ");
        String name = sc.nextLine();
        
        System.out.println("O nome digitado: " + name);
    }
}
