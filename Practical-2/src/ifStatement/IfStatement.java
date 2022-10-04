package ifStatement;

public class IfStatement {

	public static void main(String[] args) {
		int number1 = 10;
		int number2 = 10;
		
		if (number1 > number2) {
			System.out.println("Biggest is " + number1);
		} else if (number1 < number2){
			System.out.println("Biggest is " + number2);
		} else {
			System.out.println("These numbers are the same");
		}

	}

}