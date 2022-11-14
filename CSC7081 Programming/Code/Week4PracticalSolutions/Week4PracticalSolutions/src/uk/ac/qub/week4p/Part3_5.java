package uk.ac.qub.week4p;

/**
 * Outputs even number  between 1 - 100
 * @author amcgowan
 *
 */
public class Part3_5 {

	/**
	 * Constant value that is the end point for the loop
	 */
	public static final int END = 100;

	/**
	 * Outputs the even numbers only between 1 - 100
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("Even numbers bewteen 1 and 100");
		for (int loop = 1; loop <= END; loop++) {
			// check if even
			if (loop % 2 == 0) {
				// even - so printing out
				System.out.println(loop);
			}
		}
	}
}
