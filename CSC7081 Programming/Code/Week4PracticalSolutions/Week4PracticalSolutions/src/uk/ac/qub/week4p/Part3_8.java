package uk.ac.qub.week4p;

/**
 * Class illustrates nested FOR loops
 * @author amcgowan
 *
 */
public class Part3_8 {

	/**
	 * Outputs series of numbers and stars ... 
	 * *1, *2, *3, *4, *5, *6, *7, *8, *9, *10 
     * **1,  **2, **3, **4, **5, **6, **7, **8, **9, **10
     * ***1,  ***2,* **3,* **4,* **5,* **6,* **7,* **8,* **9,* **10
	 * @param args
	 */
	public static void main(String[] args) {

		// uses a nested for loop (i.e. a loop inside another)
		// outer loops runs 1 -3 
		for (int outer=1; outer<=3; outer++){
			// runs from 1 - 10
			for (int inner=1; inner<=10; inner++){
				// check if one, two or three stars required
				if (outer==1){
					System.out.print("* "+inner);
				} else if (outer==2){
					System.out.print("** "+inner);
				} else {
					System.out.print("*** "+inner);
				}
				// add the comma ?
				if (inner!=10){
					System.out.print(", ");
				}
			} // end of inner loop
			// line break added
			System.out.println();
		} // end of outer loop
	} // end main
} // end class
