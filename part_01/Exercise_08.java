package part_01;

/**
 * Part 1 Exercise 8:
 *
 *      Write the necessary code that prints out the area
 *      and perimeter of a circle with a radius of 3.14
 *
 *
 */
public class Exercise_08 {

    public static void main(String[] args) {
        double radius = 3.14;
        int x = 2;

        System.out.println("Area = " + (Math.PI * (radius * radius)));
        System.out.println("Perimeter = " + (2 * (Math.PI * radius)));


    }

}
