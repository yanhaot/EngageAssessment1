import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String userInput = "";
		
		do {
			play();
			System.out.println("Do you wanna play another round? [Yes/No]");
            userInput = scanner.nextLine();
		} 
		while (userInput.equals("Yes"));
		
	}
	
	  static void play() {
			Scanner scanner = new Scanner(System.in);

			int playerWins = 0;
			int computerWins = 0;
			int roundCounter = 0;
					
			System.out.println("How many rounds would you like to play?");
			int noRounds = scanner.nextInt();

			
			while(roundCounter <= noRounds - 1) {
				
				System.out.println("What is your move? (1 - rock, 2 - paper, 3 scissors):");
				int playerMove = scanner.nextInt();
				
				// Validation
				if (playerMove < 1 || playerMove > 3) {
					System.out.println("You have entered an invalid input. Please try again.");
				}
				else {
					
					// 1 - rock, 2 - paper, 3 scissors
					int computerMove = (int)(Math.random() * 3) + 1;
					// Check Results
					if (computerMove == playerMove) {
						playerWins++;
						computerWins++;
					}
					// Computer's win
					else if (computerMove == 1 && playerMove == 3 ||
							computerMove == 2 && playerMove == 1 ||
							computerMove == 3 && playerMove == 2) {
						computerWins++;
					} else {
						playerWins++;
					}
					roundCounter++;
				}
			}
			
			// Generate final results
			if (playerWins == computerWins) {
				System.out.println("It's a tie!");
			} else if(playerWins > computerWins) {
				System.out.println("You won!");
			} else {
				System.out.println("The computer won...");
			}
	  }
}
