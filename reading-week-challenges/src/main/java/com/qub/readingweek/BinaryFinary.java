package com.qub.readingweek;

public class BinaryFinary {
    /**
     * Given the following array that represents an 8 bit (non signed) binary number
     * boolean[] eightBitArray = { true, false, false, true, false, true, false, true };
     * write a method that will output the array as a 0 or 1 based number representation; where true =1 and false = 0 i.e.
     * 1 0 0 1 0 1 0 1
     * binarySkull.GIF
     * Feeling like a REAL challenge ?
     * Write a method that'll output the decimal value of the 8 bit number in the array.
     * i.e.  As decimal : 149
     * A basic overview of the binary number system and how these true/false values in the array relate to the decimal value can be found here: Link Links to an external site.
     * (You will explore binary number systems in more detail as part of the Foundations module when it begins)
     */

    public static void main(String[] args) {
        for (boolean value : eightBitArray) {
            System.out.print(value ? 1 + " " : 0 + " ");
        }
        System.out.println();
        System.out.println("Decimal: " + binaryToDecimal(eightBitArray));

    } // end main

    public static boolean[] eightBitArray = { true, false, false, true, false, true, false, true };

    public static int binaryToDecimal(boolean[] booleanBinaryArray) {
        String binaryNumberString = "";
        int binaryDecimal;

        // convert array to binary number string
        for (boolean value : booleanBinaryArray) {
            binaryNumberString += value ? 1 : 0;
        }
        // convert binary number string to decimal int
        binaryDecimal = Integer.parseInt(binaryNumberString, 2);
        return binaryDecimal;
    }
} // end class
