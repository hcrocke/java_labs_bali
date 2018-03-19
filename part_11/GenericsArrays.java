package part_11;

import java.util.ArrayList;

/**
 Let's say you have an integer array and a string array. Write a single method printArray that can print all
 the elements of both arrays. The method should be able to accept both integer arrays or string arrays.

 Complete the code so that it prints the following lines:

 1
 2
 3
 Hello
 World

 **/

public class GenericsArrays<T> {

    public static<E> void printArray(E[] inputArray) {

        for (E element : inputArray) {
            System.out.println(element);
        }
    }

    public static void main(String args[]){

        Integer intArray[] = {1, 2, 3};
        String stringArray[] = {"Hello", "World"};

        printArray(intArray);
        printArray(stringArray);
    }
}

