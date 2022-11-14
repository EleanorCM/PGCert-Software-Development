package uk.ac.qub.week4p;

/**
 * Class illustrates a "reversed" loop count
 * @author amcgowan
 *
 */
public class Part3_3 {

	/**
	 * Constant value that is the start point for the loop
	 */
	public static final int UPPER = 10;
	
	/**
	 * Main method - Count down. Contains a loop that runs from 10 to 1
	 * @param args
	 */
	public static void main(String[] args) {

		// loop runs from 10 to 1
		for (int loop=UPPER; loop>0; loop--){
			System.out.print(loop);
			System.out.print(", ");
		}
		System.out.println(" Liftoff!");

	}

}
