package uk.ac.qub.week4p;

public class Part3_6 {

	/**
	 * Constant value that is the end point for the loop
	 */
	public static final int END = 40;

	/**
	 * Constant value that is the start point for the loop
	 */
	public static final int START = 10;

	/**
	 * Method outputs via a loop the odd number between START and END
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("Odd numbers bewteen 10 and 40");
		for (int loop = START; loop <= END; loop++) {
			if (loop % 2 == 0) {
				continue;
			}
			System.out.println(loop);
		}
	}
}
