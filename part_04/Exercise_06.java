package part_04;


import java.util.ArrayList;

/**

 Implement, and populate a non-circular, consumptive queue (once a value has been retrieved
 it cannot be retrieved again) of integers 0 through 100. Then print out every other
 value in the queue.

 expected output: 0,2,4,6,8.....100

 */

class Queue {
    // must be an object in the triangle brackets
    //declaring an ArrayList of integers
    private ArrayList<Integer> list = new ArrayList<>();
    //creating a method to take in values to the queue
    public void enqueue(int x) {
        //use the add method on the list object
        list.add(x);

    }
    //no parameter needed because just taking the first one from the queue
    public int dequeue(){
        //need to create a variable to store the data taken out
        int temp = list.get(0);
        //use the list object to call the remove method
        list.remove(0);

        return temp;

    }

    public int size(){
        //call the size method on list to get the number to return
        return list.size();
    }

}

class TestQueue {

    public static void main(String[] args) {

        Queue myQueue = new Queue();
        //use the name of the object created to call the enqueue method using the .dot operator
//        myQueue.enqueue(5);
//        System.out.println(myQueue.dequeue());

        for(int x = 0; x <= 101; x++) {
            myQueue.enqueue(x);
        }
        while (myQueue.size() > 1) {

            System.out.println(myQueue.dequeue());
            myQueue.dequeue();
        }
    }
}