package part_05;

import java.util.ArrayList;

/**
 * Write three classes. The Class_01 should contain the main method. The main method should create an instance **AKA object**
 * of Class_02. Class_02 must have several private instance variables. Use Class_01 to set the variables in Class_02 **getters/setters.
 * Within Class_02, create an instance of Class_03, which must also have several private variables. Use Class_02 to set
 * the private variables within Class_03. Please note, do not use the constructor of any of these classes to set the
 * private instance variables. Use System.out.println at various points to demonstrate the flow of execution and
 * the varying state of each private variable. You may name these classes whatever you like.
 */

class Travel {
    //main method
    public static void main(String[] args) {

        Walk shoes = new Walk(); //this is the instance/object of class Walk
        Scooter razor = new Scooter();
        shoes.setSize(4); //variable set from class Walk
        shoes.setColor("red"); //variable set from class Walk
        shoes.setisNew(true); //variable set from class Walk
        System.out.println("Shoe size is: " + shoes.getSize());
        System.out.println("Shoe color is: " + shoes.getColor());
        System.out.println("New shoes? " + shoes.getisNew());
        System.out.println();

        //call scooterController method on the Walk class since it belongs to that class and needs to be executed in main
        Walk.scooterController();
        objectRec(shoes);//calling static to static method within the same class, passing it the shoes object
//        System.out.println("Shoe color after calling the method is: " + shoes.getColor());
//        System.out.println("Now are these new shoes?" + shoes.getisNew());
//        System.out.println("Shoe size after calling the scooterController method: " + shoes.getSize());

        objectRec2(razor);

    }
    //new method called objectRec to pass the object in main to
    //takes in a new object called object of type Walk - name of the class of the object
    public static void objectRec(Walk object){
        //call method setColor on new object called "object"
        object.setColor("blue");
        object.setisNew(false);
        object.setSize(10);
        //call method getColor to return the color of object and print it to the console
        System.out.println("Shoe color: " + object.getColor());
        System.out.println("New? " + object.getisNew());
        System.out.println("What size? " + object.getSize());
        System.out.println();
    }
    public static void objectRec2(Scooter object2) {
        //here is where the variables are manipulated and set to new values
        object2.setisManual(true);
        object2.setMaxMph(8);
        object2.setDriverName("Hannah's got this one. ");
        System.out.println("Now is the scooter manual? " + object2.getisManual());
        System.out.println("Max MPH? " + object2.getMaxMph());
        System.out.println("Who's driving? " + object2.getDriverName());
        System.out.println();
    }
}

class Walk {

    private int size;
    private boolean isNew;
    private String color;


    public void setSize(int size) {
        this.size = size;
    }
    public int getSize() {
        return size;
    }
    public void setisNew(boolean isNew) {
        this.isNew = isNew;
    }
    public boolean getisNew() {
        return isNew;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }
    public static void scooterController() {
        Scooter whip = new Scooter();
        whip.setDriverName("Never Hannah.");
        whip.setMaxMph(60);
        whip.setisManual(false);
        System.out.println("Scooter driver's name is: " + whip.getDriverName());
        System.out.println("Max MPH is: " + whip.getMaxMph());
        System.out.println("Is it manual? " + whip.getisManual());
        System.out.println();
    }
}

class Scooter {

    private boolean isManual;
    private int maxMph;
    private String driverName;

    public void setisManual(boolean isManual) {
        this.isManual = isManual;
    }
    public boolean getisManual() {
        return isManual;
    }
    public void setMaxMph(int maxMph) {
        this.maxMph = maxMph;
    }
    public int getMaxMph() {
        return maxMph;
    }
    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }
    public String getDriverName() {
        return driverName;
    }
}