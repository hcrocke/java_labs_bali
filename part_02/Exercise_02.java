package part_02;

import java.util.Scanner;

/**
 * Part 2 Exercise 2:
 *
 *      Write the necessary code that reads the radius
 *      and the length of a cylinder from the console
 *      then computes the volume and area and prints the
 *      results to the console.
 *
 *      tip: area = radius * radius * 3.1415 (roughly)
 */

public class Exercise_02 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a radius for a cylinder: ");

        double radius = input.nextDouble();

        System.out.print("Enter a length for a cylinder: ");

        double length = input.nextDouble();

        System.out.println("The volume of your cylinder is: " + Math.PI * radius * radius * length);
        System.out.println("The surface area of your cylinder is: " + (2 * Math.PI * radius * length) + (2 * Math.PI * radius * radius));
    }

}