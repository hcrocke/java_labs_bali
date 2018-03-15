package part_06.Inheritance;

public class MilkshakeIPA extends IPA {

    private String flavor;

    MilkshakeIPA(String f, int i, boolean o, String c, String s, double a) {
        super(i, o, c, s, a);
        flavor = f;

        setOnTap(false);
        setColor("hazy orange");
        setStateOrigin("MN");
        setAbv(6.0);

        System.out.println("How many would you like? " + pourOne(10));
    }

}
