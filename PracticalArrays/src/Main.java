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
        System.out.println("Tallest; " + studentHeights.);

    } // end main
} // end class