package com.qub.readingweek;

public class FizzBuzz {
    public static void main(String[] args) {
        for (int i=0; i<=100; i++) {
            if (i % 3 == 0) {
                System.out.print("Fizz, ");
            } else if (i % 5 == 0) {
                System.out.print("Buzz, ");
            } else {
                System.out.print(i + ", ");
            }
        }
    }
} // end class
