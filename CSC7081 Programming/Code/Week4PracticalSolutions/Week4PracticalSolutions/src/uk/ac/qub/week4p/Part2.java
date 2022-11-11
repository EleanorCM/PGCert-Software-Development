package uk.ac.qub.week4p;

import java.util.Scanner;

/**
 * Program demos imports, keyboard input, do while loop and if .. else
 * statements
 * 
 * @param args
 */
public class Part2 {

	/**
	 * Method produces a menu on screen
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		// variable to hold the menu option from the user
		int option;

		// scanner gets its input from the console.
		Scanner scanner = new Scanner(System.in);

		// we want the menu to display at least once so a do .. while is the
		// best loop option
		do {
			System.out.println("Menu _____________________");
			System.out.println("1. File");
			System.out.println("2. Edit");
			System.out.println("3. Delete");
			System.out.println("4. Exit");
			System.out.println("Enter option ");
			// read in the users option (as an int)
			option = scanner.nextInt();
			if (option == 1) {
				System.out.println("Your option : File");
			} else if (option == 2) {
				System.out.println("Your option : Edit");
			} else if (option == 3) {
				System.out.println("Your option : Delete");
			} else if (option == 4) {
				System.out.println("Your option : Exit");
			} else {
				// unknown option
				System.out.println("Invalid option.  Try again");
			}

		} while (option != 4);
		System.out.println("Program quitting");

		scanner.close();
	}

}
