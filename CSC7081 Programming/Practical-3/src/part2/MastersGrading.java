package part2;

import java.util.Scanner;

public class MastersGrading {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int userMark = -1;

		
		while (userMark < 0 || userMark > 100) {
			System.out.println("Enter your grade as a whole number between 0 and 100");
			userMark = sc.nextInt();
			}  if (userMark >= 70) {
				System.out.println("Distinction");
			} else if (userMark >= 60) {
				System.out.println("Merit");
			} else if (userMark >=50) {
				System.out.println("Pass");
			} else {
				System.out.println("Fail");
			}

	}

}
