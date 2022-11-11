package lotterySystem;

// import lotterySystem.LottoLogo;

public class LottoChecker {

    static String lottoLogo = 
            "░█░░░█▀█░▀█▀░▀█▀░█▀█░░░█▀▀░█░█░█▀▀░█▀▀░█░█░█▀▀░█▀▄\n"
          + "░█░░░█░█░░█░░░█░░█░█░░░█░░░█▀█░█▀▀░█░░░█▀▄░█▀▀░█▀▄\n"
          + "░▀▀▀░▀▀▀░░▀░░░▀░░▀▀▀░░░▀▀▀░▀░▀░▀▀▀░▀▀▀░▀░▀░▀▀▀░▀░▀";
  
                     // Having a Lotto fun with ASCII

  public static void main(String[] args) throws InterruptedException {

      // Store user's chosen numbers
      Integer[] playerNums = { 3, 6, 9, 18, 24, 38 }; // integer array

      // Store winning numbers
      Integer[] winningNums = { 2, 8, 9, 24, 31, 36 };

      for (int lett=0; lett<lottoLogo.length(); lett++) {
          Thread.sleep(10);
          System.out.print(lottoLogo.charAt(lett));
      };

      // Print user numbers
      System.out.print("\nYour selection ... "); // This should be made into a method
      for (int i = 0; i < playerNums.length - 1; i++) { // to avoid duplication with winningNums.
          Thread.sleep(10);
          System.out.print(playerNums[i] + ", "); // Both print by iterating through array
      } // with for loop
      System.out.print(playerNums[playerNums.length - 1]);
      System.out.println();

      // Print winning numbers
      System.out.print("Winning balls ... ");
      for (int i = 0; i < winningNums.length - 1; i++) {
          Thread.sleep(10);
          System.out.print(winningNums[i] + ", ");
      }
      System.out.print(winningNums[winningNums.length - 1]);
      System.out.println();
      System.out.println("Checking for winners ...");

      // Comparing numbers
      int allMatchesCount = getAllMatchesCount(playerNums, winningNums);
      System.out.println("You have " + allMatchesCount + " total winning numbers.");
      
      // Add verdict:
      System.out.println(giveVerdict(allMatchesCount));
  } // end main

    /**
     * A method to compare player numbers with winning numbers and total the matches
     * @param playerNums The player's chosen numbers
     * @param winningNums The winning numbers
     * @return The number of matches
     */
    private static int getAllMatchesCount(Integer[] playerNums, Integer[] winningNums) {
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
