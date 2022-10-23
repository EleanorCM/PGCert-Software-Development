package arraypackage;

public class ShoeAverageMethod {
    public static void main(String[] args) {
        double[] myNewArray = new double[] {1,55,4.3,6.4,3.4};
        System.out.println(arrayAvg(myNewArray));
    } // end main

    public static double arrayAvg(double[] numbers) {
        double total = 0;
        for (int i=0; i< numbers.length; i++) {
            total+=numbers[i];
        }
        double avg = total / numbers.length;
        return avg;
    }

} // end class
