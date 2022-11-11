package uk.ac.qub.week4p;

/**
 * Leap year finder
 * @author amcgowan
 *
 */
public class Part3_9 {

	/**
	 * Constant value that is the start year
	 */
	public static final int START_YEAR = 1910;

	/**
	 * Constant value that is the end point for the loop
	 */
	public static final int END_YEAR = 1990;

	/**
	 * Loop runs from START_YEAR to END_YEAR outputs only leap years
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		for (int loop = START_YEAR; loop < END_YEAR; loop++) {

			if (loop % 4 == 0) {
				// leap year print to screen
				System.out.println(loop);
			}
		}
	}
}
