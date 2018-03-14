package part_05;

/**
 * Write two classes. Class_01 should have the main(). Class_02 must have 3 or more private variables. Class_02 must
 * also have at least 3 overloaded constructors. In Class_01.main() create several instances of Class_02 using each
 * overloaded constructor. Each constructor should do something slightly differently. Class_02 must have at least
 * two private instance variables. Using the various instances of Class_02 that you now have in Class_01, call a method
 * within each instance of Class_02 to modify Class_02's private instance variables.
 *
 */

class ConstructDemo {

    public static void main(String[] args) {

        OvrldConstruct ex1 = new OvrldConstruct();
        ex1.setVar1(3.5);

        OvrldConstruct ex2 = new OvrldConstruct('c');
        ex2.setVar2(4);

        OvrldConstruct ex3 = new OvrldConstruct(545);
        ex3.setVar3(false);

        System.out.println("Variable 1 is: " + ex1.getVar1());
        System.out.println("Variable 2 is: " + ex2.getVar2());
        System.out.println("Variable 3 is: " + ex3.getVar3());

    }
}

class OvrldConstruct {

    private double var1;
    private int var2;
    private boolean var3;

    OvrldConstruct() {
        System.out.println("Hello!");
    }
    OvrldConstruct(char z) {
        System.out.println("Hello! " + var1);
    }
    OvrldConstruct(int x) {
        System.out.println("Hello! " + var2);
    }

    public void setVar1(double var1) {
        this.var1 = var1;
    }
    public double getVar1() {
        return var1;
    }
    public void setVar2(int var2) {
        this.var2 = var2;
    }
    public int getVar2() {
        return var2;
    }
    public void setVar3(boolean var3) {
        this.var3 = var3;
    }
    public boolean getVar3() {
        return var3;
    }
}