package J2025_13_05.RockPaperScissor;

import java.util.Scanner;

public class Player {
    private String name;

    public Player() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        this.name = scanner.nextLine();
    }

    public String getName() {
        return this.name;
    }

}
