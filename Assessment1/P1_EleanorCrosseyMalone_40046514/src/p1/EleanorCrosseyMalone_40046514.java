package p1;

import java.util.Random;
import java.util.Scanner;

public class EleanorCrosseyMalone_40046514 {
	/** A program simulating a game of Rock, Paper, Scissors
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner rounds = new Scanner(System.in);
		System.out.println("How many rounds would you like to play?");
		int numberOfRounds = rounds.nextInt();
		int winRecord = 0;
		int loseRecord = 0;
		int drawRecord = 0;

		for (int i = 0; i < numberOfRounds; i++) {

			// ask for user choice
			String myChoice = getUserChoice();
			System.out.println(myChoice);
			// computer choice - generate random number and map to choice

			String computerChoice = getComputerChoice();
			System.out.println(computerChoice);

			// compare user choice with computer choice
			String result;
			// if there is a draw
			if (myChoice.equalsIgnoreCase(computerChoice)) {
				result = "draw";
				drawRecord++;
				// possible outcomes if user chooses rock
			} else if (myChoice.equalsIgnoreCase("rock")) {
				if (computerChoice.equals("paper")) {
					result =  getResultMessage(myChoice, computerChoice) + "You lose!";
					loseRecord++;
				} else {
					result = getResultMessage(myChoice, computerChoice) + "You win!";
					winRecord++;
				}
				// possible outcomes if user chooses paper
			} else if (myChoice.equalsIgnoreCase("paper")) {
				if (computerChoice.equals("scissors")) {
					result = getResultMessage(myChoice, computerChoice) + "You lose!";
					loseRecord++;
				} else {
					result = getResultMessage(myChoice, computerChoice) + "You win!";
					winRecord++;
				}
				// possible outcomes if user chooses scissors
			} else {
				if (computerChoice.equals("rock")) {
					result = getResultMessage(myChoice, computerChoice) + "You lose!";
					loseRecord++;
					
				} else {
					result = getResultMessage(myChoice, computerChoice) + "You win!";
					winRecord++;
				}	
			}
			System.out.println(result);
		} // end for loop
		
		System.out.println("Final Statistics");
		double winPercentage = ((winRecord*100)/numberOfRounds);
		double losePercentage = ((loseRecord*100)/numberOfRounds);
		double drawPercentage = ((drawRecord*100)/numberOfRounds);
		
		System.out.printf("Win Percentage: %.2f\n", winPercentage);
		System.out.printf("Lost Percentage: %.2f\n", losePercentage);
		System.out.printf("Draw Percentage: %.2f\n", drawPercentage);
	} // end main

	
	/** A method generating a random number and mapping it to a choice of rock, paper or scissors
	 * @return The computer's random choice
	 */
	public static String getComputerChoice() {
		Random randomNum = new Random();
		int computerNum = randomNum.nextInt(3);
		String randomChoice;
		if (computerNum == 0) {
			randomChoice = "rock";
		} else if (computerNum == 1) {
			randomChoice = "paper";
		} else {
			randomChoice = "scissors";
		}
		return randomChoice;
	}
	
	public static String getResultMessage(String userChoice, String computerChoice) {
		String resultMessage = "You chose " + userChoice + ". The computer chose " + computerChoice + ". ";
		return resultMessage;
		
	}

	
	/** A method prompting the user to input a choice of rock, paper or scissors and ensuring the input is valid.
	 * @return The user's choice
	 */
	public static String getUserChoice() {
		String userChoice;
		do {
			System.out.println("Enter your choice. Must be 'rock', 'paper' or 'scissors'");
			Scanner userScanner = new Scanner(System.in);
			userChoice = userScanner.nextLine();
		} while (!userChoice.equalsIgnoreCase("rock") && !userChoice.equalsIgnoreCase("paper")
				&& !userChoice.equalsIgnoreCase("scissors"));
		return userChoice;
	}
} // end class
