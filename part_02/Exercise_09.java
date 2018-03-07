package part_02;


/**
 * Part 2 Exercise 9:
 *
 *      Use a do-while loop to print out the letters of the alphabet in reverse order.
 *
 */
public class Exercise_09 {

    public static void main(String[] args) {

        char letter = 'z';
        int x = 0;

        do {
            //first prints out z as letter already holds that value at the top
            System.out.println(letter);
            //increments x by one
            x++;
            //decrements letter by one, then checks the while statement to make sure it's still less than 26
            letter--;
        //checks at the bottom that x is still less than 26 and goes back up to the do statement until false
        } while (x < 26);
    }
}


