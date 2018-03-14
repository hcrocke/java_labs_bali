package part_05;

/**
 * Demonstrate how variable-arity works, aka varargs. Create a method that uses "String ... varargs". Within the
 * varargs method, use StringBuilder to build a nicely formatted String/sentence using the varargs. Print this statement
 * to the console. Do this at least 3 times with different Strings/sentences.
 */

class VarargsDemo {

    public static void main(String[] args) {

        vaDemo("hello");
        vaDemo("hello" , "how" , "are" , "you?");


    }

    static void vaDemo(String...varargs) {

        StringBuilder obj = new StringBuilder();

        for (int i = 0; i < varargs.length; i++) {
            obj.append(varargs[i] + " ");
        }

        System.out.println(obj.toString());

    }
}


