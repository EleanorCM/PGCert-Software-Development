/* Part 1 – 
Write a Java statement to accomplish each of the following tasks:
1. Declare variables sum and num to be of type int.
2. Assign 1 to variable num.
3. Assign 0 to variable sum.
4. Add variable num to variable sum, and assign the result to variable sum.
5. Print "The sum is: ", followed by the value of variable sum.
Combine the statements that you wrote above into a Java application that calculates and 
prints the sum of the integers from 1 to 10. Use a while statement to loop through the 
calculation and increment statements. The loop should terminate when the value of num 
becomes 11. */

package uk.ac.qub.loops;

public class PartOne {

	public static void main(String[] args) {
		int sum = 0;
		for (int num = 1; num<=10; num++) {
			sum += num;
		}
		System.out.println("The sum is: " + sum);
	}

}
