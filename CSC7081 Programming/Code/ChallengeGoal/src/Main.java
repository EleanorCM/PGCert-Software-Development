import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int[] saves = new int[5];

        // start of 5 tries
        for (int i = 0; i < 5; i++) {
            System.out.println(placeToShoot + "Select shot: ");
            int tempChoice = sc.nextInt();
            while (tempChoice < 1 || tempChoice > 9) {
                System.out.println("Must be between 1 and 9 inclusive. Choose again");
                tempChoice = sc.nextInt();
            } // end while
            System.out.println("Placing the ball... Walking back... Run up... SHOOT!");
            int userChoice = tempChoice;
            int computerChoice = rand.nextInt(9);
            if (userChoice == computerChoice) {
                System.out.println("SAVE!");
                saves[i] = userChoice;
            } else {
                System.out.println("GOAL! Keeper went to " + computerChoice);
                goals += 1;
            }
        } // end of 5 tries
        System.out.println("Goals scored: " + goals + "/5");
        System.out.println(performanceMessage(goals));
        System.out.println("Thanks for playing");
    } // end main

    static String placeToShoot = "        _______________________\n" +
            "        |  1       2        3  |\n" +
            "        |  4       5        6  |\n" +
            "        |  7       8        9  |\n" +
            "______________________________________________\n";

    static int goals = 0;
    static Scanner sc = new Scanner(System.in);
    static Random rand = new Random();

    public static String performanceMessage(int goals) {
        String message;
        switch (goals) {
            case 0:
            case 1:
                message = "You have disgraced your country and family!";
                break;
            case 2:
                message = "Back to training!";
                break;
            case 3:
                message = "Use your good foot!";
                break;
            case 4:
                message = "Not bad, but not perfect";
                break;
            case 5:
                message = "Fluke! The keeper's not even that good anyway";
                break;
            default:
                message = "Don't know what to say";
        }
        return message;
    }

} // end class

