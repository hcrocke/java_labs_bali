package part_10;

public class MyThread implements Runnable {

    String thread;

    MyThread(String name) {
        thread = name;
    }

    // Entry point of thread.
    public void run() {
        System.out.println(thread + " starts here.");
        try {
            for(int count=0; count < 5; count++) {
                Thread.sleep(200);
                System.out.println("In " + thread +
                        ", count is " + count);
            }
        }
        catch(InterruptedException exc) {
            System.out.println(thread + " interrupted.");
        }
        System.out.println(thread + " terminates here.");
    }
}

class UseThreads {
    public static void main(String args[]) {
        System.out.println("Main thread starts here.");

        MyThread myT = new MyThread("Thread Object");

        Thread newThrd = new Thread(myT);

        newThrd.start();

        for(int i=0; i<50; i++) {
            System.out.print(".");
            try {
                Thread.sleep(50);
            }
            catch(InterruptedException exc) {
                System.out.println("Main thread interrupted.");
            }
        }

        System.out.println("Main thread ends here.");
    }

}
