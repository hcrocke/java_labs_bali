package part_10;

public class RunnablePractice4 implements Runnable {

    Thread th;

    public RunnablePractice4 (String name) {
        th = new Thread (this, name);
        th.start();
    }

    @Override
    public void run() {
        //somethinggggg
    }
}
