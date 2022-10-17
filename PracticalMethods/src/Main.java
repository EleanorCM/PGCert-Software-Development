import java.util.Calendar;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        oddOrEvenChecker(234);
//        caseConverter("I LIKE CHICKENS");
//        multipleChecker(5, 30);
//        randNumGenerator();
//        starCountdown();
//        printNumberInWord(5);
//        incrementalSum(4);
//        amOrPm();

    } // end main


    // 1.1
    public static String oddOrEvenChecker(int num) {
        if ((num % 2) > 0) {
            System.out.println("Odd");
            return "Odd";
        } else {
            System.out.println("Even");
            return "Even";
        }
    } // end oddOrEvenChecker


    // 1.2
    public static String caseConverter(String toBeConverted) {
        // Note the exercise suggests using char data type
        String convString = toBeConverted.toLowerCase();
        System.out.println(convString);
        return convString;
    }

    // 1.3
    public static String multipleChecker(int num1, int num2) {
        if (num2 % num1 == 0) {
            System.out.println(num2 + " is a multiple of "+ num1);
            return "We got a multiple";
        } else {
            System.out.println("Not quite");
            return "Npt quite";
        }
    }


    // 1.4
    public static void randNumGenerator() {
        System.out.println("Generating 10 random integers in range 1...100");
        for (int i=0; i<10; i++) {
            Random randNum = new Random();
            int generatedNum = randNum.nextInt(101);
            System.out.println("Generated : " + generatedNum);
        }
    }

    // 1.5
    public static void starCountdown() {
        Scanner sc = new Scanner(System.in);
        int input = 0;
         while (input < 5 || input > 50) {
             System.out.println("Pick a number between 5 and 50 inclusive:");
             input = sc.nextInt();
             if (input < 5 || input > 50) {
                 System.out.println("Error: Number out of range");
             }
         }
        for (int i = input; i > 0; i--)
        {
            System.out.println(i + " " + ("*".repeat(i)));
        }

    }

    // 1.6
    public static void printNumberInWord(int numberToPrint) {
        if (numberToPrint < 1 || numberToPrint > 10) {
            System.out.println("Error: numberToPrint is out of range. Must be between 1 and 10 inclusive.");
        } else {
            switch (numberToPrint) {
                case 1:
                    System.out.println("ONE");
                    break;
                case 2:
                    System.out.println("TWO");
                    break;
                case 3:
                    System.out.println("THREE");
                    break;
                case 4:
                    System.out.println("FOUR");
                    break;
                case 5:
                    System.out.println("FIVE");
                    break;
                case 6:
                    System.out.println("SIX");
                    break;
                case 7:
                    System.out.println("SEVEN");
                    break;
                case 8:
                    System.out.println("EIGHT");
                    break;
                case 9:
                    System.out.println("NINE");
                    break;
                case 10:
                    System.out.println("TEN");
                    break;
            }
        }
    }


    // 1.7
    public static void incrementalSum(int upperBound) {
        int sum = 0;
        double count = 0;
        for (int i = 1; i <= upperBound; i++) {
            sum += i;
            count += 1;
        }
        System.out.println("The sum is " + sum);
        System.out.println("The average is " + (sum / count));
    }


    // 1.8
    public static void amOrPm() {
        Calendar cal = Calendar.getInstance();
        int currentAmPm = cal.get(Calendar.AM_PM);
        if (currentAmPm == 1) {
            System.out.println("PM");
        } else {
            System.out.println("AM");
        }
    }


} // end class