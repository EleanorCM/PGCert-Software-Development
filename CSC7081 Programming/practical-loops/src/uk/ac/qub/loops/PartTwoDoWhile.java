/* Write a Java program using a do.. while statement to accomplish the following Menu tasks:
1. Output to screen the following menu and prompt the user for a response ...
1. File
2. Edit
3. Save
4. Delete
5. Exit
Select option ....
2. Depending on the option selected output an appropriate message.  For example if 
the user selects 1 then output “File selected”.  The menu should then be shown on 
the screen again and the user prompted for another option.  Only exit the program if 
the user selects 5.
Note : if the user selects any entry other than 1-5 you should output an error 
message and redisplay the menu and again prompt for an option.   */

package uk.ac.qub.loops;

import java.util.Scanner;

public class PartTwoDoWhile {

	public static void main(String[] args) {
		int option;
		
		do {
			System.out.println("1. File\r\n" + "2. Edit\r\n" + "3. Save\r\n" + "4. Delete\r\n" + "5. Exit\r\n"
					+ "Select option ....");

			Scanner sc = new Scanner(System.in);
			option = sc.nextInt();

			switch (option) {
			case 1:
				System.out.println("You chose 1. File");
			case 2:
				System.out.println("You chose 2. Edit");
			case 3:
				System.out.println("You chose 3. Save");
			case 4:
				System.out.println("You chose 4. Delete");
			case 5:
				System.out.println("Exiting");
				break;
			default:
				System.out.println("Try again");
			}
		} while (option != 5);
		System.out.println("End");
	}
}