package part_10;
/* Multithreading challenges:
1) create 5 classes that each implement Runnable - each class should have a constructor that takes in a name and passes
it to the Thread object along with "this" - ie:
```thrd = new Thread(this, name);```
before starting the Thread (in the constructor).
*/

public class RunnablePractice1 implements Runnable {

    Thread thrd;

    public RunnablePractice1 (String name) {
        thrd = new Thread (this, name);
        thrd.start();
    }
    @Override
    public void run() {

    }
}
