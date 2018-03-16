package part_08;

public class Throw {

    public static int arrayPractice(int[] a) throws ArithmeticException {
        try {
            int x = a[0] / a[1];
            return x;
        } catch (ArithmeticException ae) {
            throw new ArithmeticException();
        }
    }
}

