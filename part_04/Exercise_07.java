package part_04;



import java.util.Scanner;

/**
 The complement of a queue is a stack. It uses first-in, last-out accesssing and is often likened to a stack of plates.
The first plate put on the table is the last plate used. Create a stack class called Stack that can hold characters. Call
the method that access the stack push() and pop(). Allow the user to specify the size of the stack when it is created.
Keep all other members of the Stack class private.
 */

class Stack {
    //declare an array
    private char[] array;
    private int index = 0;
    //constructor to allow the user to specify size
    Stack(int size) {

        array = new char[size];
    }

    public void push(char c) {

        array[index] = c;
        index++;
    }

    public char pop() {
        //create a variable to store the value returned
        char temp = array[index - 1];
        index--;
        return temp;
    }
}

class StackTester {

    public static void main(String[] args) {

        Stack myStack = new Stack(26);

        for(char x = 'a'; x <= 'z'; x++) {
            myStack.push(x);
        }
        for(int y = 0; y < 26; y++) {
            System.out.println(myStack.pop());
        }
    }
}