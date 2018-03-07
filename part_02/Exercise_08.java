package part_02;

import java.util.Scanner;

/**
 * Part 2 Exercise 8:
 *
 *      Receive a number between 0 and 1,000,000,000 from the user.
 *      Use while loop to find the number - when the number is found
 *      exit the loop and print the number to the console.
 *
 */
public class Exercise_08 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter any number between 1 and 1,000,000,000: ");
        int number = input.nextInt();

        while (number <= 1000000000) {
            System.out.println("Your number is: " + number);
            number++;
            return;
        }
    }
}

