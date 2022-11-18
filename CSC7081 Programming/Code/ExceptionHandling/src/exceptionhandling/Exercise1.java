package exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        boolean proceed = false;
        Scanner sc = new Scanner(System.in);
        do {
            try {
                int age = 0;
                System.out.println("Type your age and hit enter");
                age = sc.nextInt();
                System.out.printf("%d! That is quite old.\n", age);
                sc.close();
                System.out.println("Scanner closed");
                proceed = true;
            } catch (NullPointerException ex) {
                System.out.println("Null occurred. Try again");
                ex.printStackTrace();
                sc.nextLine(); // clears scanner
            } catch (InputMismatchException ex) {
                System.out.println("That's not a valid age! Try again");
                ex.getMessage();
                sc.nextLine(); // clears scanner
            } catch (Exception ex) {
                System.out.println("Something's gone wrong. Try again");
                sc.nextLine(); // clears scanner
            }
            finally {
                System.out.println("Hello from the finally block");
            }
        } while (!proceed);
        System.out.println("proceeded successfully");

    } // end main
} // end class
