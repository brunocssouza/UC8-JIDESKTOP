package J2025_13_05.RockPaperScissor;

import java.util.Scanner;

public class Player {
    private String name;

    /*
    Criar na classe Player:
    - atributo 'attempts';
    - metodo que incrementa o atributo;
    - metodo que retorna o atributo;

    Mostrar, ao final, a quantidade de tentativas que foram necessárias
     */

    public Player() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        this.name = scanner.nextLine();
    }

    public String getName() {
        return this.name;
    }

}
