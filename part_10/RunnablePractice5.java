package part_10;

public class RunnablePractice5 implements Runnable {

    Thread threaddd;

    public RunnablePractice5 (String name) {
        threaddd = new Thread (this, name);
        threaddd.start();
    }

    @Override
    public void run() {
        //this does something
    }
}
