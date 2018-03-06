package part_01;

/**
 * Part 1 Exercise 10:
 *
 *      If a runner runs 12 kilometers in 30 minutes and 30 seconds. What is his/her average speed
 *      in miles per hour. (Tip: 1 mile = 1.6 km)
 *
 */

public class Exercise_10 {

    public static void main(String[] args) {

        int x = 12, a = 60;
        double y = 1.6;
        double z = 30.5;


        double distance = x / y;
        double time = z / a;

        System.out.println("mph = " + distance / time);

    }

}