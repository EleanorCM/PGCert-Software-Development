package uk.ac.qub.week4p;

/**
 * Class that outputs a reverse countdown using a while loop
 * 
 * @author amcgowan
 *
 */
public class Part3_4 {

	/**
	 * Constant value that is the start point for the loop
	 */
	public static final int UPPER = 10;

	/**
	 * Main method - Count down. Contains a loop that runs from 10 to 1
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		int counter = UPPER;

		while (counter > 0) {
			System.out.print(counter);
			System.out.print(", ");
			counter--;
		}
		System.out.println(" Blast off!");
	}

}
