package part_03;

/**

 Write a class that has at least 3 methods, one of which being a main() method. The two other methods need to use the
 "return" keyword. Use the values returned from these two methods to accomplish a task. For instance, create a
 main() method, a multiply(int a, int b) method, and a divide(int a, int b) method. From the main method call the
 multiply and divide methods (both of which return an int) then add the two returned values together and print them out.

 */

class Part_03 {

    public static void main(String[] args) {

        Part_03 object = new Part_03();

        int a = 6;
        int b = 3;
        int c = multiply(a, b);
        int d = object.divide(a, b);

        System.out.println("The sum of the two returned values is " + (c + d));

    }

    static int multiply(int a, int b) {
        return a * b;

    }

    int divide(int a, int b) {
        return a / b;
    }

}

