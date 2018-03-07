package part_03.exercise_01;

public class Beer {

    private boolean imported;
    private boolean onTap;
    private double price;


    public static void main(String[] args) {

        Stout a = new Stout("Summit", "Oatmeal Stout", 4.7, false);
        System.out.println();

        Ipa b = new Ipa("Surly Brewing Co", "Todd the Axeman", 35, 5.8);
        System.out.println();


        System.out.println(favor());
    }

    public static String favor() {
        return "This is the best!";

    }
}

