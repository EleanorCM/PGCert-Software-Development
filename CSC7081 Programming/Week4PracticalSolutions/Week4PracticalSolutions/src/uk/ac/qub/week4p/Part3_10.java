package uk.ac.qub.week4p;

import java.util.Scanner;

/**
 * Prompts for age then outputs a message
 * 
 * @author amcgowan
 *
 */
public class Part3_10 {

	/**
	 * Prompts the user for his/her age. Then outputs a message
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// var to store age of user
		int age;
		age = 0;

		// set up scanner
		Scanner scanner = new Scanner(System.in);

		try {
			// get age - keep prompting if outside the range
			do {
				System.out.println("Enter your age ... ");
				age = scanner.nextInt();
				// clear the last new line char entered as it will interfere
				// with new input if it is required
				scanner.nextLine();
			} while (age < 1 || age > 120);

			if (age >= 1 && age <= 30) {
				System.out.println("You are young");
			} else if (age >= 31 && age <= 60) {
				System.out.println("You are getting on!");
			} else {
				System.out.println("You look amazing for your age!");
			}
		} catch (Exception ex) {
			// got here with a problem. Leaving program gracefully.
			System.out.println("Sorry, problem with your input.");
		}
		// last thing to do - close the scanner
		scanner.close();
	}
}
