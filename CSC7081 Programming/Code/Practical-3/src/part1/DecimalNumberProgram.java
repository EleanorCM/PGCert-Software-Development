package part1;

import java.util.Scanner;
import java.lang.Math;

public class DecimalNumberProgram {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Enter a decimal point number in the form of xx.xxxx eg. 12.3456");
		double userInput = scnr.nextDouble();
		
		System.out.printf("Number rounded (two decimal places): %.2f\n", userInput);
		System.out.printf("Number squared (three decimal places): %.3f\n", (double)Math.pow(userInput, 2));
		System.out.printf("Number cubed (three decimal places): %.3f\n", (double)Math.pow(userInput, 3));
		System.out.printf("Square root (four decimal places): %.4f\n", Math.sqrt(userInput));

	}

}
