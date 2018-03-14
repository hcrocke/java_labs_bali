package part_05;

/**
 * Write two classes. In Class_01 have a main method that creates on instance of Class_02. In Class_02, demonstrate
 * method overloading. You must overload a method a least 3 times. Each method should have a return type that is not
 * void. Within the main() (or a method of your choosing) in Class_01 call each overloaded method in Class_02.
 * Use System.out.println at various points to demonstrate the flow of execution. You can name these classes
 * whatever you want.
 */

class OverloadingDemo {

    public static void main(String[] args) {

        DemoHelp object = new DemoHelp();

        System.out.println(object.multiply(2,3));
        System.out.println(object.multiply(2,3,4));
        System.out.println(object.multiply(2,23));

    }
}

class DemoHelp {

    public static int multiply(int a, int b) {
        return a * b;
    }
    public static int multiply(int a, int b, int c) {
        return a * b * c;
    }
    public static int multiply(int a, byte d) {
        return a * d;
    }

}