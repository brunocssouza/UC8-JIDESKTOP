package J2025_13_05.RockPaperScissor;

public class GuessValidator {

    public int validateGuess(String userHand, String AIhand) {
        int result = 2;

        if (userHand.equals(AIhand)) {
            System.out.println("IT'S A DRAW!");
            return 0;
        } else {

            switch (userHand) {
                case "Rock":
                    if (AIhand.equals("Scissor")) {
                        result = 1;
                    }
                    break;

                case "Scissor":
                    if (AIhand.equals("Paper")) {
                        result = 1;
                    }
                    break;

                case "Paper":
                    if (AIhand.equals("Rock")) {
                        result = 1;
                    }
                    break;
                default:
                    break;
            }
            if (result == 1) {
                System.out.println("You Won!\n");
            } else if (result == 2) {
                System.out.println("You Lost!\n");
            }
            return result;
        }
    }
}
