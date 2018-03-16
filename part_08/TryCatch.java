package part_08;

public class TryCatch {

    public static int arrayPractice(int[] a) {
        try {
            int x = a[0] / a[1];
            return x;
        } catch (ArithmeticException ae) {
            System.out.println("can't divide by 0");
        } return 0;

    }

    public static void main(String[] args) {
        int[] array = new int[4];
        array[0] = 5;
        array[1] = 0;
        System.out.println(arrayPractice(array));
    }

}
