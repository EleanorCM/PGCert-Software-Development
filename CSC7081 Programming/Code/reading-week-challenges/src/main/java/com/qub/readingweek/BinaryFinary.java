package com.qub.readingweek;

public class BinaryFinary {
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
