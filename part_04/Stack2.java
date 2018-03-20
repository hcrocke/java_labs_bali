package part_04;

public class Stack2 {

    private int[] array;
    private int index = 0;

    Stack2(int size) {
        array = new int[size];
    }

    public void push(int a) {

        array[index] = a;
        index ++;
    }

    public int pop() {
        int temp = array[index - 1];
        index--;
        return temp;
    }
}

class StackTester2 {

    public static void main(String[] args) {

        Stack2 myStack = new Stack2(10);

        for(int i = 0; i < 10; i++) {
            myStack.push(i);
            System.out.println("Push to stack: " + i);
        }
        System.out.println();
        for(int j = 0; j < 10; j++) {
            System.out.println("Pop off stack: " + myStack.pop());
        }
    }
}
