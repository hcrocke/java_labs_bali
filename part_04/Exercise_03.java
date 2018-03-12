package part_04;

/**

 Create, populate, and print out a two-dimensional array that will show the following output:

 0 1 2 3 4 5 6 7 8 9
 10 11 12 13 14 15 16 17 18 19
 20 21 22 23 24 25 26 27 28 29
 30 31 32 33 34 35 36 37 38 39
 40 41 42 43 44 45 46 47 48 49

 */

public class Exercise_03 {

    public static void main(String[] strings) {
        //declare and instantiate a two-dimensional array
        int[][] twoDArray = new int[5][10];
        //declare and instantiate a variable that will be used in the for loop as a counter
        int counter = 0;
        //outer for loop to create the one-dimensional array
        //the outer for loop counts from 0 to the length of the array
        for(int x = 0; x < twoDArray.length; x++){
            //inner for loop to create the list of one-dimensional arrays
            //inner for loop should count from 0 to the length of each inner array
            //y < twoDArray[x].length means = y is less than the length of the array at the index of x
            for(int y = 0; y < twoDArray[x].length; y++){
                //at the index of x and y, assigning the value counter
                twoDArray[x][y] = counter;
                //use counter to increment each value in the inner loop
                counter ++;
            }
        }
        for(int x = 0; x < twoDArray.length; x++) {

            for(int y = 0; y < twoDArray[x].length; y++) {
                System.out.print(twoDArray[x][y] + " ");
            }
            System.out.println();
        }
    }
}