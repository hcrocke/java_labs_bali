
package part_02;

import java.util.Scanner;

/**
 * Part 2 Exercise 11:
 *
 *      Calculate investment value
 *
 *      Recieved the following args from user:
 *          - investment amount
 *          - interest rate in percentage
 *          - number of years to invest
 *
 *      Print future value to the console.
 *
 */

public class Exercise_11 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the inital investment amount: ");
        int investment = input.nextInt();

        System.out.print("Enter the interest rate percentage: ");
        double interest = input.nextDouble();

        System.out.print("Enter the number of years to invest: ");
        int years = input.nextInt();

        double yearlyInterest = investment * interest;

        System.out.println("Total investment return: " + ((yearlyInterest * years) + investment));

    }
}


