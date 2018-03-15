package part_07.Tree;

public class Coniferous extends Tree {

    private boolean needles;
    private boolean xmasQuality;

    public Coniferous () {
        super (0,0);
    }

    public Coniferous (boolean needles, boolean xmasQuality) {
        super (0,0);
        this.needles = needles;
        this.xmasQuality = xmasQuality;
    }

    public Coniferous (boolean needles, boolean xmasQuality, int age, int maxHeightMeters) {
        super (age,maxHeightMeters);
        this.needles = needles;
        this.xmasQuality = xmasQuality;
    }

    public void useForChristmas() {
        System.out.println("Can this be a Christmas tree? " + xmasQuality);
    }

    public void showSize() {
        System.out.println("Circumference: " + getTrunkCircumference());

    }
}
