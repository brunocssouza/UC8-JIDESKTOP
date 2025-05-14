package J2025_13_05.GuessGame;

public class GuessValidator {



    public boolean validateGuess(int guess, int numberToGuess) {
        if (guess > numberToGuess) {        // Palpite maior do que o numero-alvo
            System.out.println("Guess is too high");
            return false;
        } else if (guess < numberToGuess) { // Palpite menor do que o numero-alvo
            System.out.println("Guess is too low");
            return false;
        } else {
            return true;                    // Palpite correto.
        }
    }
}
