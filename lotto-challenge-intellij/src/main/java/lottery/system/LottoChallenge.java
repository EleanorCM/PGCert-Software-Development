package lottery.system;

// import lotterySystem.LottoLogo;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class LottoChallenge {

    static String lottoLogo =
            "░█░░░█▀█░▀█▀░▀█▀░█▀█░░░█▀▀░█░█░█▀▀░█▀▀░█░█░█▀▀░█▀▄\n"
                    + "░█░░░█░█░░█░░░█░░█░█░░░█░░░█▀█░█▀▀░█░░░█▀▄░█▀▀░█▀▄\n"
                    + "░▀▀▀░▀▀▀░░▀░░░▀░░▀▀▀░░░▀▀▀░▀░▀░▀▀▀░▀▀▀░▀░▀░▀▀▀░▀░▀\n";

    // Having a Lotto fun with ASCII

    public static void main(String[] args) throws InterruptedException {

        for (int lett=0; lett<lottoLogo.length(); lett++) {
            Thread.sleep(10);
            System.out.print(lottoLogo.charAt(lett));
        };

        // Dynamically store user's chosen numbers
        int[] playerNums = getPlayerNums();
        System.out.println("You chose: " + playerNums);

        // Randomly generate and dynamically store winning numbers
        int[] winningNums = getWinningNums();
        System.out.println("Winning numbers: " + winningNums);

        printNumbers(playerNums, winningNums);

        // Comparing numbers
        System.out.println("Checking for winners ...");
        int allMatchesCount = getAllMatchesCount(playerNums, winningNums);
        System.out.println("You have " + allMatchesCount + " total winning numbers.");

        // Add verdict:
        System.out.println(giveVerdict(allMatchesCount));
    } // end main


    /**
     * A method to randomly generate and dynamically store winning numbers
     * @return The winning numbers
     */
    public static int[] getWinningNums() {
        ArrayList<Integer> winningNumsArrList = new ArrayList<Integer>(0);
        Random randomNum = new Random();
        for (int i = 0; i<6; i++) {
            int randomWinningNum = randomNum.nextInt(37) + 1;
            winningNumsArrList.add(randomWinningNum);
        }
        int[] winningNums = winningNumsArrList.stream().mapToInt(i -> i).toArray();
        return winningNums;
    }


    /**
     * A method to prompt player for numbers and dynamically store them
     * @return Player's chosen numbers
     */
    public static int[] getPlayerNums() {
        // add checks to make sure: player input is 1) a number, and 2) from 1 to 38
        // inclusive
        ArrayList<Integer> playerNumsArrayList = new ArrayList<Integer>(0);
        Scanner playerScan = new Scanner(System.in);
        System.out.println("Enter 6 numbers from 1 to 38 inclusive, one at a time: ");
        for (int i = 0; i < 6; i++) {
            int numberChoice = playerScan.nextInt();
            playerNumsArrayList.add(numberChoice);
        }
        int[] playerNums = playerNumsArrayList.stream().mapToInt(i -> i).toArray();
        return playerNums;
    }

    /**
     * A method to print lottery numbers
     * @param playerNums Player's numbers
     * @param winningNums Winning numbers
     */
    public static void printNumbers(int[] playerNums, int[] winningNums) {
        // Print user numbers
        System.out.print("\nYour selection ... "); // This should be made into a method
        for (int i = 0; i < playerNums.length - 1; i++) { // to avoid duplication with winningNums.
            System.out.print(playerNums[i] + ", "); // Both print by iterating through array
        } // with for loop
        System.out.print(playerNums[playerNums.length - 1]);
        System.out.println();

        // Print winning numbers
        System.out.print("Winning balls ... ");
        for (int i = 0; i < winningNums.length - 1; i++) {
            System.out.print(winningNums[i] + ", ");
        }
        System.out.print(winningNums[winningNums.length - 1]);
        System.out.println();
    }

    /**
     * A method to compare player numbers with winning numbers and total the matches
     * @param playerNums The player's chosen numbers
     * @param winningNums The winning numbers
     * @return The number of matches
     */
    public static int getAllMatchesCount(int[] playerNums, int[] winningNums) {
        int allMatchesCount = 0;
        for (int i = 0; i < playerNums.length; i++) { // iterates through playerNums
            int numMatches = 0; // counts matches for this user number only
            for (int j = 0; j < winningNums.length; j++) {
                if (playerNums[i] == winningNums[j]) {
                    numMatches++; //increments match count for current user number
                    allMatchesCount++; // adds to overall match count
                    System.out.println("Winner " + playerNums[i]); // there might be a method for
                } // checking contents of arrays
            } // that would simplify this
            if (numMatches == 0) {
                System.out.println(playerNums[i] + " not a winner!");
            }
        }
        return allMatchesCount;
    }

    /**
     * A method to return a verdict on player's performance
     * @param matches Player's total matching numbers
     * @return The verdict
     */
    public static String giveVerdict(int matches) {
        String verdict;
        switch (matches) {
            case 0:
                verdict = "No luck at all!";
                break;
            case 1:
            case 2:
                verdict = "Not bad";
                break;
            case 3:
                verdict = "Good, maybe a trip to the shops";
                break;
            case 4:
                verdict = "Don't give up your job but maybe a holiday";
                break;
            case 5:
                verdict = "Pay your uni fees";
                break;
            case 6:
                verdict = "Tell the boss where to go";
                break;
            default:
                verdict = "Something's clearly gone wrong here";
        }
        return verdict;
    } // end giveVerdict

}// end class
