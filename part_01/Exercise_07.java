package part_01;

/**
 * Part 1 Exercise 7:
 *      Print pi to the console using the following formula: note that this is not the complete series to
 *      compute the true number pi.
 *
 *      4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11))
 *
 *
 */

public class Exercise_07 {

    public static void main(String[] args) {

        double a = 4.0, b = 1.0;
        int c = 1, d = 3, e = 5, f = 7, g = 9, h = 11;

        System.out.println("Pi = " + (a * ((c - (b/d)) + ((b/e) - (b/f)) + ((b/g) - (b/h)))));
        System.out.println(4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11)));

    }

}