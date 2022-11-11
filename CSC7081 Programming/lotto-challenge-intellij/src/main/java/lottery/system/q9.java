package lottery.system;

import java.util.Scanner;

public class q9 {
    public static void main(String[] args) {
        int response;
        System.out.println("Enter");
        Scanner scan = new Scanner(System.in);
        response = scan.nextInt();

        while (response <= 4) {
            System.out.println(--response);
        }
    }
}
