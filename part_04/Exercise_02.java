package part_04;

/**

 Use a for loop to count to 2017. While looping, populate an array with the
 value of your iterator (ie, i). Once populated, print out the odd values
 (ie, 2017, 2015, 2013) of the array in reverse order.

 */
class Exercise_02 {

    public static void main(String[] args) {
        //first create an array to hold the values as the for loop loops
        int[] count = new int[2017];

        for(int a = 0; a < 2017; a++) {
            //populate every array element with a (the value of the iterator) as it loops
            count[a] = a;
        }
        // this for loop prints the odd numbers from the array
        for(int a = 2017; a >= 0; a -= 2) {
            System.out.println(a);
        }
    }
}


