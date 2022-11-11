package uk.ac.qub.week4p;

import java.util.Scanner;

/**
 * Class that prompts the user for a name and then prints it to screen a number
 * of times.
 * 
 * @author amcgowan
 *
 */
public class Part3_1 {

	/**
	 * Constant value that is the number of times a string is output to screen
	 */
	public static final int UPPER = 10;

	/**
	 * Method that prompts the user for a name and then prints it to screen a
	 * number of times.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		// var to store user input
		String name;
		// set up the scanner
		Scanner scanner = new Scanner(System.in);

		// prompt user
		System.out.println("Enter your name");
		name = scanner.next();

		// output name 10 times
		for (int loop = 0; loop <= UPPER; loop++) {
			System.out.println(name);
		}

		// clean up resources
		scanner.close();
	}

}
