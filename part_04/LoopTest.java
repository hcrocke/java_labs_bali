package part_04;

public class LoopTest {
    public static void main(String[] args) {

//        for(int i = 999; i >= 0; i -= 4) {
//            System.out.println(i);
//        }
        int i = 1001;
        int count = 0;

        while (i > 4) {
            i -= 4;
            count--;
            System.out.println(i);
        }

        System.out.println(i);
    }
}
