package part_03.exercise_01;

public class Ipa {

    private String brewery;
    private String name;
    private double ibu;
    private double abv;

    Ipa(String brewery, String name, double ibu, double abv) {

        this.brewery = brewery;
        this.name = name;
        this.ibu = ibu;
        this.abv = abv;

        System.out.println("This beer is called " + name + ".");
        System.out.println("It's brewed by " + brewery + ".");
        System.out.println("It has an ABV of " + abv + " and IBU of " + ibu + ".");

    }




}
