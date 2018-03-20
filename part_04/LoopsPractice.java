package part_04;

public class LoopsPractice {

    public static void main(String[] args) {

        for (int i = 1000; i >= 0; i--) {
            while (i % 2 == 0) {
                System.out.println(i);
                return;
            }
        }
    }
}
