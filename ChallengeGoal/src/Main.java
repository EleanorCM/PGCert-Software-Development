import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // start of 5 tries
        for (int i = 0; i < 5; i++) {
            System.out.println("Select shot: \n" + placeToShoot);
            int tempChoice = sc.nextInt();
            while (tempChoice < 1 || tempChoice > 9) {
                System.out.println("Must be between 1 and 9 inclusive. Choose again");
                tempChoice = sc.nextInt();
            } // end while
            int userChoice = tempChoice;
            int computerChoice = rand.nextInt(9);
            if (userChoice == computerChoice) {
                System.out.println("SAVE!");
            } else {
                System.out.println("GOAL! Keeper went to " + computerChoice);
                goalsScored += 1;
            }
        } // end of 5 tries
        System.out.println("Goals scored: " + goalsScored + "/5");
        System.out.println(performanceMessage(goalsScored));
        System.out.println("Thanks for playing");
    } // end main

    static String placeToShoot = "        _______________________\n" +
            "        |  1       2        3  |\n" +
            "        |  4       5        6  |\n" +
            "        |  7       8        9  |\n" +
            "______________________________________________\n" +
            "\n" +
            "\n" +
            "                   X";

    static int goalsScored = 0;
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

