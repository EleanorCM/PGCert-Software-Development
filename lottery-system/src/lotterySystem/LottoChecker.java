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
      System.out.println("You have "+allMatchesCount+" total winning numbers.");
      
      // Add verdict:
      /**
       * 0 No luck at all!
       * 1 or 2  Not bad
       * 3 Good, maybe a trip to the shops
       * 4 Don't give up your job but maybe a holiday
       * 5 Pay your uni fees
       * 6 Tell the boss where to go ....."
       */
  }

}
