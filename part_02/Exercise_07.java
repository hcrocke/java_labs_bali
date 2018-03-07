package part_02;

import java.util.Scanner;

/**
 * Part 2 Exercise 7:
 *
 *      Write the necessary code to receive a number in minutes from the user, up to 1,000,000,000.
 *      How many years and days does that number in minutes represent?
 *
 *      For this exercise each year has 365 days.
 *
 */
public class Exercise_07 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter any number in minutes between 1 and 1,000,000,000: ");
        int minutes = input.nextInt();
        //calculate days by dividing number of minutes entered by total number of minutes in day (1440)
        int days = minutes / 1440;
        int years = days / 365;
        int minutesLeft = minutes % 525600;
        int daysLeft = minutesLeft / 1440;

        System.out.println("This is " + years + " year(s) and " + daysLeft + " days.");
    }

}


