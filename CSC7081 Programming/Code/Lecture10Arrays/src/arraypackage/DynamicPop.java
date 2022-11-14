package arraypackage;

public class DynamicPop {
    // Dynamically populating an arrayss
    public static void main(String[] args) {
        int[] numbers = new int[5];
        int val= 0;
        for (int i=0;i<numbers.length;i++) {
            numbers[i] = val;
            val+=2;
        }
        for (int i=0;i< numbers.length;i++) {
            System.out.println(numbers[i]);
        }
    } // end main
} // end class
