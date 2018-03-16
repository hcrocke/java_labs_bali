package part_08;

class Stack {
    //declare an array
    private char[] array;
    private int index = 0;

    //constructor to allow the user to specify size
    Stack(int size) {

        array = new char[size];
    }

    public void push(char c) throws StackFullException {
        if (index == array.length) {
            throw new StackFullException();
        }
        array[index] = c;
        index++;
    }


    public char pop() throws StackEmptyException {
        if (index == 0) {
            throw new StackEmptyException();

        }
        char temp = array[index - 1];
        index--;
        return temp;
    }

}

class StackTester {

    public static void main(String[] args) {

        Stack myStack = new Stack(26);

        for (char x = 'a'; x <= 'z' ; x++) {
            try {
                myStack.push(x);
            } catch (StackFullException f) {
                System.out.println(f.stackFull());
            }

        }
        for (int y = 0; y < 27; y++) {
            try {
                System.out.println(myStack.pop());
            } catch (StackEmptyException e) {
                System.out.println(e.stackEmpty());
            }
        }
    }
}
