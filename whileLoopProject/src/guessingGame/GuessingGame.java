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
			if ((guess < 1) || (guess > 10)) {
				System.out.println("Out of bounds.");
				guess = sc.nextInt();
				break;
			} else if ((guess-1) == target || (guess+1) == target) {
				System.out.println("Getting close! You're out by one.");
				guess = sc.nextInt();
				break;
			} 
			System.out.println("Try again!");
			guess = sc.nextInt();
		}
		
		System.out.println("Nice! The target was " + target);
		

	}

}
