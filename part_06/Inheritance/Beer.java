package part_06.Inheritance;

public class Beer {

    private boolean onTap;
    private String color;
    private String stateOrigin;
    private double abv;

    Beer(boolean o, String c, String s, double a) {
        setOnTap(o);
        setColor(c);
        setStateOrigin(s);
        setAbv(a);
    }

    Beer(boolean onTap) {
    }

    void describeBeer() {
        System.out.println("This beer is: " + color);
    }
//        System.out.println("On tap? " + onTap);
//        System.out.println("Color? " + color);
//        System.out.println("State of Origin? " + stateOrigin);
//        System.out.println("Alcohol by volume: " + abv);


    static int pourOne(int x) {
        return x;
    }

    public boolean getOnTap() {
        return onTap;
    }
    public void setOnTap(boolean onTap) {
        this.onTap = onTap;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getStateOrigin() {
        return stateOrigin;
    }
    public void setStateOrigin(String stateOrigin) {
        this.stateOrigin = stateOrigin;
    }
    public double getAbv() {
        return abv;
    }
    public void setAbv(double abv) {
        this.abv = abv;
    }

    public static void main(String[] args) {

        IPA Furious = new IPA(45, true, "amber", "Minnesota", 5.7);

        System.out.println(MilkshakeIPA.pourOne(10));
        Furious.describeBeer();

    }

}
