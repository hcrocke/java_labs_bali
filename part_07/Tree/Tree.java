package part_07.Tree;

/*
Create the following:

1) Write one super class with at least 3 private instance variables and at least 3 public methods
2) Write three subclasses (with at least 3 methods each that are not getters and setters) that extend the super
class. Make sure each subclass can manipulate the private variables in the super class. One subclass should
extend another subclass which extends the super class. Each subclass should only have variables and methods
that apply to that subclass, ie Animal -> Mammal -> Whale.
3) Make use of the keyword "super" in at least two constructors.
4) Write an interface with at least 3 methods. Have the superclass implement this interface.
*/

public class Tree implements TreeInterface {

    private double maxHeightMeters;
    private double trunkCircumference;
    private int age;

    public Tree(int age, double maxHeightMeters) {
        this.age = age;
        this.maxHeightMeters = maxHeightMeters;
    }


    public double getMaxHeightMeters() {
        return maxHeightMeters;
    }
    public void setMaxHeightMeters(double maxHeightMeters) {
        this.maxHeightMeters = maxHeightMeters;
    }
    public double getTrunkCircumference() {
        return trunkCircumference;
    }
    public void setTrunkCircumference(double trunkCircumference) {
        this.trunkCircumference = trunkCircumference;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void doSomething(int c, int d) {
        System.out.println("did something");
    }


}
