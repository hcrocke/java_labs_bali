package part_04;

/**

 Here's an easy one for you.

 Create and populate an array with a length no less than 5. Use the enhanced for
 loop to iterate through the array and print out each value.

 */


public class Exercise_05 {

    public static void main(String[] strings) {

        //declare and initialize with numbers in the same statement
        int[] nums = {1,2,3,4,5};

        int sum = 0;

        //for each integer x in nums (nums just being the name of the array)
        for (int x : nums) {
            System.out.println("Number is: " + x);
            sum += x;
        }
        System.out.println("The sum is: " + sum);
    }
}
