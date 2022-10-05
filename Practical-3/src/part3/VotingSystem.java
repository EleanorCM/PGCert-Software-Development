package part3;

import java.util.Scanner;

public class VotingSystem {
	
	/* Use an if ... else statement:  to check a user input value into a voting system.  The user 
should be presented with two options ‘con’ and ‘lab’.  (Representing Conservative and 
Labour.  If the entry is con then output “Voting registered for Conservative” and “Voting 
registered for Labour” upon ‘lab’ entry.  Ignore the case that the user enters these values 
in.  
(Your program should use the conditional operator to help convert the input value (con or 
lab) to Labour or Conservative respectively.
Also add some validation to ensure the user cannot register a vote if they type any other 
entry(see below)   */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String userInput = " ";
		while (userInput.isBlank()){
			System.out.println("Enter your vote: ");
			userInput = sc.nextLine().toLowerCase();
			if (!(userInput.equals("con")) && !(userInput.equals("lab"))) {
				System.out.println("Not recognised");
				userInput = " ";
			} else if (userInput.equals("con")){System.out.println("You voted conservative.\nIt's like if turkeys voted for Christmas.");
			} else {System.out.println("Labour it is.\nNot much better than the other guys to be honest.");}
		}
	}
}
