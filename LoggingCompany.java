/**
* The LoggingCompany program implements an application that
* gets input from the user and determines the max amount of
* logs that can be carried on a truck.
*
* @author  Ina Tolo
* @version 1.0
* @since   2022-2-17
*/

import java.util.Scanner;

public class LoggingCompany {
    /**
     * Main entry point into program.
     *
     * @param args nothing passed in
     * @null nothing.
     */

    // declaring constants
    private static final double MAX_WEIGHT = 1100;
    private static final double SIZE_PER_ONE = 20;
    private static final double OP_ONE = 1;
    private static final double OP_TWO = 0.5;

    private static void main(String[] args) {
        System.out.println();
        System.out.println("Today I will tell you the number of logs that can");
        System.out.println("be carried on a 1100kg logging truck.");
        System.out.println("Your options for logs are 1.0m, 0.5m, or 0.25m.\n");
        final Scanner sc = new Scanner(System.in);
        System.out.print("Enter one of the above lengths: ");
        final double length = sc.nextDouble();
        final double truckSize;

        if (length == OP_ONE) {
            truckSize = (MAX_WEIGHT / SIZE_PER_ONE) / length;
        } else if (length == OP_TWO) {
            truckSize = (MAX_WEIGHT / SIZE_PER_ONE) / length;
        } else {
            truckSize = (MAX_WEIGHT / SIZE_PER_ONE) / length;
        }
        System.out.println();
        System.out.println("The max amount of logs that can");
        System.out.println("be carried is " + truckSize + " logs.");
        System.out.println();
    }
}

