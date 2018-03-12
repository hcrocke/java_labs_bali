package part_04;


import java.util.Scanner;
/**

 Read in 10 integers from the user. Place all 10 integers into an array in the order they were received.
 Print out the second integer received, followed by the 4th, then the 6th, then the 8th, then the 10th.
 The print out the 9th, 7th, 5th, 3rd, and 1st.

 Example input: 1,2,3,4,5,6,7,8,9,10
 Example output: 2,4,6,8,10,9,7,5,3,1

 Output can be on one line or many lines. However you like.

 */

public class Exercise_01 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        //declaring and instantiating an array with 10 elements
        int[] userInput = new int[10];


        for(int x = 0; x < 10; x++) {
            System.out.println("Enter a number: ");
            userInput[x] = input.nextInt();
        }
        for(int x = 1; x < 10; x += 2) {
            System.out.println(userInput[x]);
        }
        System.out.println();
        for(int x = 8; x >= 0; x -= 2) {
            System.out.println(userInput[x]);
        }

    }

}
