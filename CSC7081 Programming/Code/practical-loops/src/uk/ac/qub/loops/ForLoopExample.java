package uk.ac.qub.loops;

public class ForLoopExample {

    public static void main(String[] args) {
        for (int i=3; i<8; i++) { // These conditions are optional.
                                  // Omitting the continuation condition will produce an infinite loop
            System.out.println("Current i is: " + i);
            // Never manipulate the counter in the body of a for loop (Java != Python)
        }
        
        // System.out.println(i); // i was declared inside the loop so is inaccessible outside of it. This line will not print

    }

}
