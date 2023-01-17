import java.util.Random;
import java.util.Scanner;

public class GuessANumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Random randomNumber = new Random();
        int computerNumber = randomNumber.nextInt(100);
        while (true) {
            System.out.println("Guess a number (1-100): ");
            String playerInput = scanner.nextLine();
            int playerNumber;

            boolean isValid = true;

            for (int i = 0; i < playerInput.length(); i++) {
                if (playerInput.charAt(i) < 48 || playerInput.charAt(i) > 57) {
                    isValid = false;
                    break;
                }
            }
            playerNumber = Integer.parseInt(playerInput);
            if (isValid) {
                if (playerNumber == computerNumber) {
                    System.out.println("You guessed it!");
                } else if (playerNumber > computerNumber) {
                    System.out.println("Too High");
                } else {
                    System.out.println("Too Low");
                }
            }
        }
    }
}