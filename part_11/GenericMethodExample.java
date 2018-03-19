package part_11;

public class GenericMethodExample {

    public <T extends Number> void printSum (T[] vals) {

        double sum = 0;

        for (T val : vals) {
            sum += (double) val;
        }

        System.out.println(sum);
    }
}
