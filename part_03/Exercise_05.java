package part_03;

import java.util.Scanner;

public class Exercise_05 {

    public static void main(String[] strings) throws java.io.IOException {

        // read an integer from the user >=1 and <= 999,999,999
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 999,999,999: ");
        int x = input.nextInt();

        // use the && operator to see if the user's number is divisible by both 4 and 7
            if (x % 4 == 0 && x % 7 == 0) {
                System.out.println("Your number is divisible by both 4 and 7.");
            }

        // use the || operator to see if the user's number is divisible by 4 or 7
            if (x % 4 == 0 || x % 7 == 0) {
                System.out.println("Your number is divisible by either 4 or 7.");
            }

        // use the ^ operator to see if the user's number is divisible for 4 or 7 exclusively
            if (x % 4 == 0 ^ x % 7 == 0) {
                System.out.println("Your number is divisible by only 4 or 7.");
            }
        // print out the results
    }
}


