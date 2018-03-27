package part_10;

public class RunnablePractice2 implements Runnable {

    Thread t;

    public RunnablePractice2 (String name){
        t = new Thread (this, name);
        t.start();
    }

    @Override
    public void run() {
        int a = 100;
        int b = 0;

        while (b <= a);
        System.out.println(b);
    }
}
