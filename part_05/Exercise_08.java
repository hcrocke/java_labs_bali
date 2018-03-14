package part_05;

/**
 * Write one class. This class must make use of an inner/nested class **(non-static)**. Within the nested class, set the instance variables
 * of the outer class. Also, within the inner class, call at least two methods that have a return type of int. Add these
 * two ints together and set a final instance variable in the outer with this value.
 *
 *
 * Write one class. This class must make use of an inner/nested class. Within the nested class, access the instance variables
 of the outer class. Also, within the inner class, call at least two methods that have a return type of int.
 */

class NestedEx {


}

class OuterClass {

    int var1;
    double var2;
    private int sum;

    int add (int a, int b) {
        return a + b;
    }


    class InnerClass {
         void innerclassmethod () {

             var1 = 10;
             System.out.println(var1);
             System.out.println(add(2, 3));
         }



    }
    public static void main(String[] args) {

        OuterClass object = new OuterClass();
        object.main2();


    }

    void main2 () {

        InnerClass object2 = new InnerClass();
        object2.innerclassmethod();


        }
}