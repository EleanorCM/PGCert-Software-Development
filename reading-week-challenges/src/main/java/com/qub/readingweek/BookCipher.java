package com.qub.readingweek;

public class BookCipher {
    public static void main(String[] args) {
        // extract last character of each row to a string

        // for each row in 2DArray...
        for (int i = 0; i < secretMessage.length; i++) {
            // grab the last word
            int lastWordIndex = secretMessage[i].length - 1;
            // grab the last character of the last word
            String secretWord = secretMessage[i][lastWordIndex];
            char secretLetter = secretWord.charAt(secretWord.length()-1);
            // concatenate to String
            secretString += secretLetter;
            }

        // print message in uppercase
        System.out.println(secretString.toUpperCase());

    } // end main

    public static String[][] secretMessage = { { "Buzz", "LightYear" ,"was"},
            {"once", "apon", "a"}, { "time","probably" ,"the "},
            { "coolest", "character", "in", "Toy", "Story 2"},
            { "but ", "Woody "},{ "was ", "always ", "Andy's " , "wow"},
            { "toy.", "i"},{ "was", "never", "keen" },
            { "because ", "I ", "don't "}, { "rate","Tom","Hanks.", "Woody ", "is","quite","dour"},
            { "but"," Lightyear,", "could fly, sort of...", "Anyhow"},{ "the","movies","are", "classic"} };

    public static String secretString = "";
} // end class
