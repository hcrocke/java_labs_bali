package part_02;

import java.util.Scanner;

/**
 * Part 2 Exercise 5:
 *
 *      Write a program called PrintNumberInWord which prints "ONE", "TWO",... ,
 *      "NINE", "OTHER" if the int variable "number" is 1, 2,... , 9, or other, respectively.
 *      Use a "nested-if" statement;
 *
 *
 */
public class Exercise_05 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 9: ");
        int number = input.nextInt();

        if (number >= 1) {
            if (number >= 2) {
                if (number >= 3) {
                    if (number >= 4) {
                        if (number >= 5) {
                            if (number >= 6) {
                                if (number >= 7) {
                                    if (number >= 8) {
                                        if (number == 9) {
                                        }
                                        System.out.println("NINE");
                                        return;
                                    }
                                    System.out.println("EIGHT");
                                    return;
                                }
                                System.out.println("SEVEN");
                                return;
                            }
                            System.out.println("SIX");
                            return;
                        }
                        System.out.println("FIVE");
                        return;
                    }
                    System.out.println("FOUR");
                    return;
                }
                System.out.println("THREE");
                return;
            }
            System.out.println("TWO");
            return;
        }
        System.out.println("ONE");
        return;
    }
}




