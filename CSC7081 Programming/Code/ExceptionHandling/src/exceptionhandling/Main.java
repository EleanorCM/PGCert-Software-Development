package exceptionhandling;

public class Main {

    public static void main(String[] args) {
        method1();
    } // end main

    public static void method1() {
        System.out.println("In method 1");
        method2();
        System.out.println("Now leaving method 1");
    }

    public static void method2() {
        try {
            int[] nums = new int[] {1,2,3,4,5};
            for (int i=0; i<6; i++) {
                System.out.println(nums[i]);
            }
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Reached the last element of the array, now terminating :)");
        } catch (Exception ex) {
            System.out.println("Something went wrong there");
        }
    }

 } // end class