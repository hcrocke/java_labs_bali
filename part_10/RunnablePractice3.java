package part_10;

public class RunnablePractice3 implements Runnable {

    Thread thr;

    public RunnablePractice3 (String name) {
        thr = new Thread (this, name);
        thr.start();
    }
    @Override
    public void run() {
        //does something
    }
}
