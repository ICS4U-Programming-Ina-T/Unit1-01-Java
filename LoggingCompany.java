// The LoggingCompany program implements an application that
// gets input from the user and determines the max number of
// logs that can be carried on a 1100kg truck.
//
// @author  Ina Tolo
// @version 1.0
// @since   2022-2-17

import java.util.Scanner;

/**
 * The class begins here.
 *
 * @return nothing.
 */

class LoggingCompany {
    /**
     * Declaring constant.
     */
    private static final double MAX_WEIGHT = 1100;
    /**
     * Declaring constant.
     */
    private static final double SIZE_PER_ONE = 20;
    /**
     * Declaring constant.
     */
    private static final double OP_ONE = 1;
    /**
     * Declaring constant.
     */
    private static final double OP_TWO = 0.5;
    /**
     * Main entry point into program.
     *
     * @param args nothing passed in
     */

    public static void main(String[] args) {
        // displays message to the terminal
        System.out.println();
        System.out.println("Today I will tell you the number of logs that can");
        System.out.println("be carried on a 1100kg logging truck.");
        System.out.println("Your options for logs are 1.0m, 0.5m, or 0.25m.\n");
        // creates scanner
        final Scanner sc = new Scanner(System.in);
        // gets input from the user
        System.out.print("Enter one of the above lengths: ");
        final double length = sc.nextDouble();
        // initializes variables
        final double truckSize;
        // determines max number of logs for each length
        if (length == OP_ONE) {
            truckSize = (MAX_WEIGHT / SIZE_PER_ONE) / length;
        } else if (length == OP_TWO) {
            truckSize = (MAX_WEIGHT / SIZE_PER_ONE) / length;
        } else {
            truckSize = (MAX_WEIGHT / SIZE_PER_ONE) / length;
        }
        // blank line
        System.out.println();
        // displays results
        System.out.println("The max amount of " + length + "m logs that");
        System.out.println("can be carried is " + truckSize);
        // blank line
        System.out.println();
    }
}

