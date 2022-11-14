package com.qub.readingweek;

import java.util.Arrays;

public class CodeBreaker {
    public static void main(String[] args) {
        String myName = "Eleanor Crossey Malone";
        int[] myASCIIName = {69, 108, 101, 97, 110, 111, 114, 32, 67, 114, 111, 115, 115, 101, 121, 32, 77, 97, 108, 111, 110, 101};

        System.out.println("My name coded to ASCII values: "+Arrays.toString(CodeToASCIIValue(myName)));
        System.out.println("My ASCII code name decoded to String: "+DecodeToString(myASCIIName));
    } // end main

    /**
     * Encodes given String to an integer array representing the ASCII values of each consecutive character.
     * @param nameString The String to be encoded
     * @return Integer array containing ASCII values
     */
    public static int[] CodeToASCIIValue(String nameString) {
        int nameLength = nameString.length();
        int[] ASCIIArray = new int[nameLength];
        for (int i=0; i < nameLength; i++) {
            ASCIIArray[i] = nameString.charAt(i);
        }
        return ASCIIArray;
    }

    /**
     * Decodes given integer array to a String.
     * @param nameASCIIValue
     * @return name as String
     */
    public static String DecodeToString(int[] nameASCIIValue) {
        String nameString = "";
        for (int currentASCIILetter : nameASCIIValue) {
            nameString += (char) currentASCIILetter;
        }
        return nameString;
    }
} // end class
