package part_10;

public class UseRunnables {

    public static void main(String[] args) {

        System.out.println("Main thread starting here.");

        RunnablePractice2 thrdObj = new RunnablePractice2("thread object");

        Thread littleThread = new Thread(thrdObj);

        littleThread.start();
    }


}
