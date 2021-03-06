package part_01;

/**
 * Part 1 Exercise 11:
 *      In the U.S., if there is:
 *          - One person who is born every 6 seconds
 *          - One person who dies every 12 seconds
 *          - One person who immigrates every 40 seconds
 *
 *      Write the necessary code to display the total population for the next 3 years (without a leap year)
 *
 *      Let's say the current population is 380,123,456.
 *
 */

public class Exercise_11 {

    public static void main(String[] args) {

        int currentPopulation = 380123456;
        // 31543200 is total seconds in a year
        int born = 31543200 / 6;
        int deaths = 31543200 / 12;
        int immigrates = 31543200 / 40;

        int bornB = born * 3;
        int deathsD = deaths * 3;
        int immigratesI = immigrates * 3;

        System.out.println("Total population for the next three years: " + (currentPopulation - deathsD + (bornB + immigratesI)));


    }

}