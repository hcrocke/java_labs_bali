package part_07.Tree;

public class Deciduous extends Tree{

    private String leafCycle;

    public Deciduous() {
        super (0,0);
    }



    public void climb() {
        System.out.println("How high can I climb? " + getMaxHeightMeters());

    }

    public String plantTree() {
        return "the tree is planted";

    }
}
