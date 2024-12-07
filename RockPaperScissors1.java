package homework03;
import java.util.Random;
import java.util.Scanner;
public class RockPaperScissors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        Scanner scanner = new Scanner(System.in);
		        Random random = new Random();
		        boolean playAgain = true;

		        while (playAgain) {
		            int playerScore = 0;
		            int computerScore = 0;
		            int roundsPlayed = 0;

		            System.out.println("Welcome to Rock, Paper, Scissors (Best 2 out of 3)!");

		            while (roundsPlayed < 3) {
		                System.out.println("\nRound " + (roundsPlayed + 1));
		                System.out.print("Enter your move (rock, paper, or scissors): ");
		                String playerMove = scanner.nextLine().toLowerCase();

		                // Validate player input
		                if (!playerMove.equals("rock") && !playerMove.equals("paper") && !playerMove.equals("scissors")) {
		                    System.out.println("Invalid input. Computer gets a point.");
		                    computerScore++;
		                } else {
		                    // Computer move
		                    int compMove = random.nextInt(3);  // 0 = rock, 1 = paper, 2 = scissors
		                    String computerMove = "";
		                    if (compMove == 0) {
		                        computerMove = "rock";
		                    } else if (compMove == 1) {
		                        computerMove = "paper";
		                    } else {
		                        computerMove = "scissors";
		                    }

		                    System.out.println("Computer chose: " + computerMove);

		                    // Determine winner of the round
		                    if (playerMove.equals(computerMove)) {
		                        System.out.println("It's a draw!");
		                    } else if (playerMove.equals("rock") && computerMove.equals("scissors") ||
		                            playerMove.equals("paper") && computerMove.equals("rock") ||
		                            playerMove.equals("scissors") && computerMove.equals("paper")) {
		                        System.out.println("You win this round!");
		                        playerScore++;
		                    } else {
		                        System.out.println("Computer wins this round!");
		                        computerScore++;
		                    }
		                }

		                roundsPlayed++;
		            }

		            // Determine overall winner
		            System.out.println("\nFinal Scores - You: " + playerScore + " | Computer: " + computerScore);
		            if (playerScore > computerScore) {
		                System.out.println("Congratulations! You won the game!");
		            } else if (computerScore > playerScore) {
		                System.out.println("The computer won the game!");
		            } else {
		                System.out.println("It's a tie!");
		            }

		            // Ask to replay the game
		            System.out.print("\nDo you want to play again? (yes/no): ");
		            String replayChoice = scanner.nextLine().toLowerCase();
		            if (!replayChoice.equals("yes")) {
		                playAgain = false;
		                System.out.println("Thank you for playing!");
		            }
		        }

		        scanner.close();
		    }
		

	}


