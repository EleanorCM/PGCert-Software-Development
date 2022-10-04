package guessingGame;

import java.util.Scanner;
import java.util.Random;

public class GuessingGame {

	public static void main(String[] args) {
		Random rand = new Random();
		
		int target = rand.nextInt(10)+1;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Pick a number between 1 and 10: ");
		
		int guess = sc.nextInt();
		
		while(guess!=target) {
			System.out.println("Wrong. Try again!");
			guess = sc.nextInt();
		}
		
		System.out.println("Nice! The target was " + target);
		

	}

}
