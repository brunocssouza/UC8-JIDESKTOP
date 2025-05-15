package J2025_13_05.RockPaperScissor;

import java.util.Arrays;
import java.util.Scanner;

public class Game {

    private Player player = new Player();
    private GuessValidator guessValidator = new GuessValidator();
    private Scanner scanner = new Scanner(System.in);
    private String AIhand; // Número aleatório;
    private String[] options;

    public Game() {
        this.options = new String[]{"Rock", "Paper", "Scissor"};
    }

    public void start() {

        System.out.println("Welcome to Rock-Paper-Scissor Game, " + player.getName() + "!");
        int[] wins = new int[]{0,0};    // [Usuario, AI]

        while (wins[0] < 3 && wins[1] < 2) {
            System.out.println(Arrays.toString(wins));
            System.out.println("Escolha entre:");
            System.out.println("1 - Rock");
            System.out.println("2 - Paper");
            System.out.println("3 - Scissor");
            System.out.println("4 - Exit");

            int guess = scanner.nextInt();
            if (guess > 0 && guess < 4) {
                int randomNum = (int) (Math.random() * 3); // Gera um número entre 1 e 100
                this.AIhand = options[randomNum];
                String userHand = options[guess-1];

                System.out.println("Your choice: " + userHand);
                System.out.println("AI choice: " + AIhand);
                int resultado = guessValidator.validateGuess(userHand, AIhand);

                if (resultado == 1) {
                    wins[0]++;
                } else if (resultado == 2) {
                    wins[1]++;
                }

            } else if (guess == 4) {
                System.out.println("Goodbye...");
                return;
            } else {
                System.out.println("Invalid guess!");
            }
        }
        if (wins[0] >= 2) {
            System.out.println("You won the game! ("+wins[0]+"/"+wins[1]+")");
        } else if (wins[1] >= 2) {
            System.out.println("You lost the game! ("+wins[0]+"/"+wins[1]+")");
        }
    }
}
