/* Create an application that will prompt the user to ask a question... 

the application will then output (randomly) one of the following responses.

As I see it, yes.
Ask again later.
Better not tell you now.
Cannot predict now.
Concentrate and ask again.
Don't count on it.
It is certain.
It is decidedly so.
 

Hints :

Use the Scanner to input the question from the user.

Use the Random class to a random number from 1 to 8. 

Use that number to select the response (use a switch statement for that).

 

Example output... */

package magic8ball;

import java.util.Scanner;
import java.lang.Math;

public class Magic8Ball {

	public static void main(String[] args) {

		String[] responses = { "As I see it, yes.", "Ask again later.", "Better not tell you now.",
				"Cannot predict now.", "Concentrate and ask again.", "Don't count on it.", "It is certain.",
				"It is decidedly so." };

		Scanner sc = new Scanner(System.in);

		String question = "";
		
		System.out.println("The Illustrious Magic 8 Ball\n"
				+ "\t .-\"\"\"-.\r\n"
				+ "\t/   _   \\\r\n"
				+ "\t|  (8)  |\r\n"
				+ "\t\\   ^   /\r\n"
				+ "\t '-...-'");

		while (question.isBlank()) {
			System.out.println("Ask your question, traveller: ");
			question = sc.nextLine();
			System.out.println("You asked \"" + question + "\". The Magic 8 Ball says: ");
			int number = (int) (Math.random() * 8);
			System.out.println(responses[number]);
			System.out.println("Will you ask another question? (y/n)");
			String again = "";
			while (again.length() < 1) {
				again = sc.nextLine();
				if (again.toLowerCase().equals("y")) {
					question = "";
				} else if (again.toLowerCase().equals("n")) {
					System.out.println("The Ball bids you farewell");
				} else { System.out.println("I didn't understand that. Enter \"y\" or \"n\": ");
				again = "";
					
				}
			}

		}
	}
}
