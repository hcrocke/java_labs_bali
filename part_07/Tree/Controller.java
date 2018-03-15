package part_07.Tree;

public class Controller {

    public static void main(String[] args) {

        Cedar cedar = new Cedar();
        System.out.println("Are the needles soft enough for a bed? " + cedar.makeBed());

        Deciduous deciduous = new Deciduous();
        System.out.println(deciduous.plantTree());

        Coniferous coniferous = new Coniferous();

        Coniferous coniferous1 = new Coniferous(true, false);

        Coniferous coniferous2 = new Coniferous(true, true, 5, 10);


    }
}
