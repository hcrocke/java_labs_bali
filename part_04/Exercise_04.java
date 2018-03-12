package part_04;

/**
 *
 */

class Exercise_04 {
    public static void main(String[] args) {
        int[][] dataArray = {
                {12, 45, 67},
                {8, 4, 13, -43, 98},
                {567, 1, 0, -2},
                {18, -456, 14, 6, 48, -80}
        };
        // uncomment the lines below when your methods are ready


        System.out.println(getMaxVal(dataArray));
        System.out.println(getMinVal(dataArray));
        System.out.println("Sum is: " + getSum(dataArray));
    }

    // write a method called getMaxVal that takes in a 2D array and iterates through the array to determine the max value in array
    public static int getMaxVal(int[][] array){

        int maxVal = 0;

        for (int x = 0; x < array.length; x++) {
            //first you get the row and then you get the length of the row
            for (int y = 0; y < array[x].length; y++) {
                if (array[x][y] > maxVal) {
                    maxVal = array[x][y];
                }
            }
        }
        return maxVal;

    }

    // write a method called getMinVal that takes in a 2D array and iterates through the array to determine the min value in array
    public static int getMinVal(int[][] array) {

        int minVal = 0;

        for (int x = 0; x < array.length; x++) {
            for (int y = 0; y < array[x].length; y++) {
                if (array[x][y] < minVal) {
                    minVal = array[x][y];
                }
            }
        }
        return minVal;
    }
    //parameters always include the data (array) we need to take in
    public static int getSum(int[][] array) {

        //default value that will save the data as we loop through
        int sum = 0;
        //type of each row is an int array
        for (int[] row : array) {
            //column is where each number (int) is saved
            for (int column : row){
                sum += column;
            }
        }
        return sum;
    }

}