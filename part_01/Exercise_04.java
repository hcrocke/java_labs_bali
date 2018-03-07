package part_01;

 /**
 * Part 1 Exercise 4:
 *      Write the necessary code to print the following table to the console:
 *
 *      a   a*2 a*4
 *      1   2   4
 *      ....
 *      4   8   16
 *
 */
public class Exercise_04 {

     public static void main(String[] args) {

         System.out.println("a\ta*2\t a*4");

         for(int row = 1; row <= 4; row++) {

             for(int column = 1; column <= 4; column *= 2) {
                 System.out.print((row * column) + "  " + "  ");
             }
             System.out.println();
         }
     }
}

