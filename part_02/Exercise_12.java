package part_02;

import java.util.Scanner;

/**
 * Part 2 Exercise 12:
 *
 *
 *      Receive the following arguments from the user:
 *          - miles to drive
 *          - MPG of the car
 *          - Price per gallon of fuel
 *
 *      Display the cost of the trip in the console.
 *
 *
 */

public class Exercise_12 {

    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        System.out.print("Enter total miles to drive: ");
        double miles = input.nextDouble();

        System.out.print("Enter your car's MPG: ");
        double mpg = input.nextDouble();

        System.out.print("Enter the price per gallon of fuel: ");
        double cost = input.nextDouble();

        System.out.println("Cost of the trip will be: " + (miles / mpg) * cost);

    }
}