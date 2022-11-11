package asciiconverter;

import java.util.Scanner;

public class ASCIIConverter {

	public static void main(String[] args) {

		// Print user menu
		System.out.println("ASCII Convertor Menu................\r\n" + "1. Show ASCII Table\r\n"
				+ "2. Convert a Character to ASCII\r\n" + "3. Convert your name to ASCII\r\n" + "4. Quit\r\n"
				);

		Scanner sc = new Scanner(System.in);
		int userInput = 0;
		while (userInput != 4) {
			System.out.println("Enter menu item number");
			userInput = sc.nextInt();
			sc.nextLine();
			if (userInput == 1) {
				// Show ASCII table
				for (int charLoop = 32; charLoop <= 127; charLoop++) {
					System.out.println(charLoop + "\t" + (char) charLoop);
				}
			} else if (userInput == 2) {
				// Convert character to ASCII
				System.out.println("Enter character number to convert to ASCII");
				Scanner getChar = new Scanner(System.in); // create char Scanner
				int userChar = getChar.nextInt();
				getChar.nextLine();
;				if (userChar < 32 || userChar > 127) {
					System.out.println("Character outside range");
				} else {System.out.println(userChar + "\t" + (char) userChar);
				}
			} else if (userInput == 3) {
				// Convert name to ASCII
				System.out.println("Enter name to convert to ASCII");
				Scanner getName = new Scanner(System.in); // create name Scanner
				String userName = getName.nextLine(); // invoke name Scanner
				for (int i = 0; i < userName.length(); i++) { // iterate through name, printing and converting
					char currentLetter = userName.charAt(i);
					System.out.println(currentLetter + "\t" + (int) currentLetter);
				}
			} else if (userInput > 4 || userInput < 1) {
				// Restart
				System.out.println("Not recognised, try again");
			} else {
				// Quit
				System.out.println("Quitting program");
			}
		}
		System.out.println("Goodbye");
	}

}

// My ASCII converter: https://www.online-java.com/ixdbLc9n5P
// (I'm allergic to switch statements Upside down face
)