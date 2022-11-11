package part3;

import java.util.Scanner;

public class AgeChecker {

	public static void main(String[] args) {
		/* 1. Prompt the user for his/her age.  Then check if the user is over 17.  If so then prompt the 
user for a name.  Then output the user’s inputted name and age.  Otherwise if not over 17 
then output “too young to continue” (i.e. do not prompt for name).  In addition ensure 
that the user does not enter a negative number or 0 for age. (if so exit the program 
gracefully with “sorry don’t recognise your input”. */

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age: ");
		int userAge = sc.nextInt();
		
		if (userAge > 17) {
			String userName = sc.nextLine();
		} else if (userAge < 0) {
			System.out.println("Input not recognised");
		} else {
			System.out.println("Sorry, you're too young to continue");
		}
	}

}
