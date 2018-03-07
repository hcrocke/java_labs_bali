package part_02;


/**
 * Part 2 Exercise 10:
 *
 *      Write a program that prints out every prime number between 1 and 100
 *
 */
public class Exercise_10 {

    public static void main(String[] args) {
        // create outer for loop to run through all numbers between 1 and 100
        for (int x = 2; x <101; x++) {
            // set boolean to check for prime number each time to true
            // this will automatically set each value to true before running through inner for loop
            boolean isPrime = true;
            // create inner for loop to pull the values that will be divided by x from the outer for loop
            // since we're looking for prime, the value (y) in the inner for loop should start at 2 (not 1 since all--
            // -- numbers are divisible by 1, and should be less than the value (x) in the outer loop since dividing--
            // -- by itself would also work
            for (int y = 2; y < x; y++) {
                // create an if statement that checks whether or not the (x) value divided by any (y) value produces 0
                if (x % y == 0) {
                    // if a 0 is produced as determined in the if statement, isPrime is changed from true to false
                    isPrime = false;
                }
            }
            // another if statement to determine from outer for loop whether number is prime
            // if statements determine if condition set in parenthesis is true
            if (isPrime)
            System.out.println(x);
        }

    }
}


