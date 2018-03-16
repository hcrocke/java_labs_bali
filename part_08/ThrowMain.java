package part_08;

public class ThrowMain {

    public static void main(String[] args) {
        int[] array = new int[4];
        array[0] = 5;
        array[1] = 0;
        try {
            System.out.println(Throw.arrayPractice(array));
        } catch (ArithmeticException ae) {
            ae.printStackTrace();
        }

        System.out.println("noice");
    }
}
