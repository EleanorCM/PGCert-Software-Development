package uk.ac.qub.week4p;

public class Part1 {

	/**
	 * Main method calculates and prints the sum of the integers from 1 to 10
	 * @param args
	 */
	public static void main(String[] args) {
		
		int sum;
		int num;
		// initialise num to 1 for counting
		num = 1;
		// initialise sum to 0 for the total
		sum = 0;

		// while num is less than or equal to 10
		while (num <= 10) {
			// add num to sum
			sum += num;
			++num;
		} // end while
		System.out.printf("The sum is: %d\n", sum);
	} // end main
} // end class

