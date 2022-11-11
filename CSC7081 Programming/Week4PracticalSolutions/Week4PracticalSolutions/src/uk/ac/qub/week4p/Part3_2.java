package uk.ac.qub.week4p;

public class Part3_2 {

	/**
	 * Constant value that is the number of times a string is output to screen
	 */
	public static final int UPPER = 10;

	/**
	 * Prints number 1 - 10 with a comma between numbers
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		for (int loop = 1; loop <= UPPER; loop++) {

			System.out.print(loop);

			// add the comma ?
			if (loop != 10) {
				System.out.print(", ");
			}
		}
	}
}
