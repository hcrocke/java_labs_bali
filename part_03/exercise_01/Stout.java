package part_03.exercise_01;

public class Stout {

    private String brewery;
    private String name;
    private double abv;
    private boolean onNitro;

    Stout(String brewery, String name, double abv, boolean onNitro) {

        this.brewery = brewery;
        this.name = name;
        this.abv = abv;
        this.onNitro = onNitro;

        System.out.println("This beer is called " + name + ".");
        System.out.println("It's brewed by " + brewery + ".");
        System.out.println("It has an ABV of " + abv + ".");
        System.out.println("Available on nitro: " + onNitro);


    }
}
