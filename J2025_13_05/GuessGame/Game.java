package J2025_13_05.GuessGame;

import java.util.Scanner;

public class Game {
    private final int numberToGuess; // Número aleatório;
    private final Player player;
    private final GuessValidator guessValidator;
    private Scanner scanner;

    public Game() {
        this.numberToGuess = (int) (Math.random() * 100) + 1; // Gera um número entre 1 e 100
        this.player = new Player();
        this.guessValidator = new GuessValidator();
        this.scanner = new Scanner(System.in);
    }

    public void start() {

        System.out.println("Welcome to Guess Game, " + player.getName() + "!");
        boolean hasWon = false;

        while (!hasWon) {
            System.out.println("Guess the number:");
            int guess = scanner.nextInt();
            hasWon = guessValidator.validateGuess(guess, numberToGuess);
        }
        System.out.println("You guessed the number!");
    }
}
