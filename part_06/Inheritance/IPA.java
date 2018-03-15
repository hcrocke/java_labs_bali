package part_06.Inheritance;

public class IPA extends Beer {

    private int ibu;

    IPA(int i, boolean o, String c, String s, double a) {//pg. 236
        super(o, c, s, a);
        ibu = i;
    }
//        setOnTap(o);
//        setColor(c);
//        setStateOrigin(s);
//        setAbv(a);

    void describeBeer() {
        System.out.println("This beer has " + ibu + " ibu.");
    }
//        setOnTap(true);
//        setColor("light golden");
//        setStateOrigin("Minnesota");
//        setAbv(6.8);

//        System.out.println("Is this on tap? " + getOnTap());
//        System.out.println(getColor());
//        System.out.println(getStateOrigin());
//        System.out.println(getAbv());


}

