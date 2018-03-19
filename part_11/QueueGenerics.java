package part_11;

/*
 * Modify your Queue Class so that it is completely generic
 */

import java.util.ArrayList;
//
//public class QueueGenerics {

//    private ArrayList< T > list = new ArrayList< T >();
//
//    public void enqueue(int x) {
//
//        ArrayList.add(x);
//
//    }
//    //no parameter needed because just taking the first one from the queue
//    public int dequeue(){
//        //need to create a variable to store the data taken out
//        int temp = list.get(0);
//        //use the list object to call the remove method
//        list.remove(0);
//
//        return temp;
//
//    }
//
//    public int size(){
//        //call the size method on list to get the number to return
//        return list.size();
//    }
//
//}
//
//class TestQueue {
//
//    public static void main(String[] args) {
//
//        QueueGenerics myQueue = new QueueGenerics();
//        //use the name of the object created to call the enqueue method using the .dot operator
////        myQueue.enqueue(5);
////        System.out.println(myQueue.dequeue());
//
//        for(int x = 0; x <= 101; x++) {
//            myQueue.enqueue(x);
//        }
//        while (myQueue.size() > 1) {
//
//            System.out.println(myQueue.dequeue());
//            myQueue.dequeue();
//        }
//    }
//
//}
