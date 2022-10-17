import java.util.Random;

public class Main {
    public static void main(String[] args) {
        oddOrEvenChecker(234);
        caseConverter("I LIKE CHICKENS");
        multipleChecker(5, 30);
    } // end main

    public static String oddOrEvenChecker(int num) {
        if ((num % 2) > 0) {
            System.out.println("Odd");
            return "Odd";
        } else {
            System.out.println("Even");
            return "Even";
        }
    } // end oddOrEvenChecker

    public static String multipleChecker(int num1, int num2) {
        if (num2 % num1 == 0) {
            System.out.println(num2 + " is a multiple of "+ num1);
            return "We got a multiple";
        } else {
            System.out.println("Not quite");
            return "Npt quite";
        }
    }

    public static String caseConverter(String toBeConverted) {
        // Note the exercise suggests using char data type
        String convString = toBeConverted.toLowerCase();
        System.out.println(convString);
        return convString;
    }

    public static void randNumGenerator() {
        System.out.println("Generating 10 random integers in range 1...100");
        for (int i=0; i<10; i++) {
            Random randNum = new Random();
            int generatedNum = randNum.nextInt(101);
            System.out.println("Generated : " + generatedNum);
        }
    }

} // end class