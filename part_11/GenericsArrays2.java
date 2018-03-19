package part_11;

/**
 Write a generic method to exchange the positions of two different elements in an array.
 */

public class GenericsArrays2 {

    public static < E > void printArray(E[] inputArray) {

        for (int i = 0; i < inputArray.length/2; i++) {
            E temp = inputArray[i];
            inputArray[i] = inputArray[inputArray.length - i];
            inputArray[inputArray.length - i] = temp;

        }
    }

    public static void main(String args[]){




    }
}
