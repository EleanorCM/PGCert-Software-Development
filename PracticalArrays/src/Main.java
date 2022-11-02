public class Main {
    public static void main(String[] args) {
        // PART 1 - ARRAYS

        // 1.1: HOURS AND WAGES
        /* Write a program that calculates the salary for an employee who has worked the following hours
        in a five-day week.

        Monday 8
        Tuesday 7
        Wednesday 9
        Thursday 7
        Friday 4
        The rate of pay is £10.25 per hour.   The program should output the number of hours
        worked each day, the total hours worked in the week and the final weekly salary.
        Use an array to store the hours and a Constant for the rate of pay.*/

        final double rateOfPay = 10.25;
        int[] hoursWorked = {8,7,9,7,4};

        // Hours worked each day
        System.out.print("Hours worked each day (Mon-Fri): ");
        for (int day : hoursWorked) {
            System.out.print(day + " ");
        }
        System.out.println();

        // Total hours in week
        int hoursTotal = 0;
        for (int day : hoursWorked) {
            hoursTotal += day;
        }
        System.out.println("Total hours worked in week: " + hoursTotal);

        System.out.println("Final weekly salary: £" + (hoursTotal*rateOfPay));

        // 1.2 TEMPERATURES
        /* Write a program that stores the following temperatures and then outputs the average
        temperature.
        3.4 4.2 9.0 2.2 4.5 6.4 3.1 */

        double[] temperatures = {3.4, 4.2, 9.0, 2.2, 4.5, 6.4, 3.1};
        double totalTemps = 0;
        for (double temp : temperatures) {
            totalTemps += temp;
        }
        System.out.println("Average temperature is " + (totalTemps/temperatures.length));

        // 1.3: HEIGHTS
        /* 1.4 1.9 1.31 1.2
        Write a program that stores the above 4 students’ heights.  Then calculate the average height
        and the tallest and smallest height.*/

        double[] studentHeights = {1.4, 1.9, 1.31, 1.2};
        double totalHeights = 0;
        for (double height : studentHeights) {
            totalHeights += height;
        }
        System.out.println("Average height: " + (totalHeights/studentHeights.length));
        System.out.println("Tallest: " + tallestOrSmallest(studentHeights, "tallest") );
        System.out.println("Smallest: " + tallestOrSmallest(studentHeights, "smallest"));
        System.out.println("Tallest: " + tallOrSmallVar(studentHeights, "tallest") );
        System.out.println("Smallest: " + tallOrSmallVar(studentHeights, "smallest"));

    } // end main

    // BUBBLE SORT APPROACH
    public static double tallestOrSmallest(double[] doubleArr, String tallOrSmall) {
        /**
         * Enter "tallest" or "smallest" to receive first or last element of sorted String
         */
        for (int i=0; i<doubleArr.length; i++) {
            for (int j=0; i<doubleArr.length; i++) {
                if (doubleArr[i] > doubleArr[j]) {
                    double temp = doubleArr[i];
                    doubleArr[i] = doubleArr[j];
                    doubleArr[j] = temp;
                }
            }
        }
        if (tallOrSmall == "smallest") {
            return doubleArr[0];
        } else if (tallOrSmall == "tallest") {
            return doubleArr[doubleArr.length-1];
        } else {
            return 0;
        }
    }

    // STORING IN A VARIABLE APPROACH
    public static double tallOrSmallVar(double[] doubleArr, String tallOrSmall) {

        double tallestHeight = doubleArr[0];
        double smallestHeight = doubleArr[0];

        for (int i=0;i<doubleArr.length;i++) {
            if (doubleArr[i] > tallestHeight) {
                tallestHeight = doubleArr[i];
            }
            if (doubleArr[i] < smallestHeight) {
                smallestHeight = doubleArr[i];
            }
        }
        if (tallOrSmall.toLowerCase() == "smallest") {
            return smallestHeight;
        } else if (tallOrSmall.toLowerCase() == "tallest") {
            return tallestHeight;
        } else {
            return 0;
        }
    }


} // end class