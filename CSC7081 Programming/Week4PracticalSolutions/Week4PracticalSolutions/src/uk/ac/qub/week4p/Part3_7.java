package uk.ac.qub.week4p;

/**
 * Class that counts down from START but count is aborted
 * 
 * @author amcgowan
 *
 */
public class Part3_7 {

	/**
	 * Constant value that is the start point for the loop
	 */
	public static final int START = 1000;

	/**
	 * Constant value that is the end point for the loop
	 */
	public static final int ABORT_POINT = 333;

	/**
	 * launch count down but abort at ABORT_POINT
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		// loop setup to run from 1000 - 1
		for (int loop = START; loop >= 0; loop--) {
			if (loop == ABORT_POINT) {
				// about the loop count
				System.out.println("Launch aborted!");
				// break from the loop
				break;
			}
			System.out.println(loop);
		} // end of for loop
	}
}
