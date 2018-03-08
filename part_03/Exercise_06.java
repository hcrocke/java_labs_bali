package part_03;


import java.util.Scanner;

class Exercise_06 {

    // the goal of this method is to print out the local time in any given timezone
    public static void main(String[] strings) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the time zone offset to GMT (ie, -8 or 8): ");
        long timeZoneChange = input.nextInt();

        // Get total milliseconds since midnight, 1/1/1970
        long totalMilliseconds = System.currentTimeMillis();
        System.out.println("total time in milliseconds: " + totalMilliseconds);

        // Get total seconds since midnight, 1/1/1970
        long totalSeconds = totalMilliseconds / 1000;
        System.out.println("total time in seconds is: " + totalSeconds);

        // Get the current second within the minute within the hour
        long secondsInThisMinute = totalSeconds % 60;
        System.out.println("The current second is: " + secondsInThisMinute);

        // Get total minutes
        long totalMinutes = totalSeconds / 60;
        System.out.println("total minutes: " + totalMinutes);

        // Get the current minute in the hour
        long minuteInTheHour = totalMinutes % 60;
        System.out.println("The current minute in the hour is: " + minuteInTheHour);

        // Get the total hours
        long totalHours = totalMinutes / 60;
        System.out.println("total hours is: " + totalHours);

        // Get the current hour
        long currentHour = (totalHours + timeZoneChange) % 24;
        System.out.println("The current hour is: " + currentHour);

        //create am/pm String to assign AM PM in sout
        String amPm = "";

        // Display results using a 12 hour clock, include AM or PM
        if (currentHour > 12) {
            currentHour -= 12;
            amPm = "PM";
        } else if (currentHour == 0) {
            currentHour = 12;
            amPm = "AM";
        } else {
            amPm = "AM";
        }
        System.out.println("The current time is: " + currentHour + ":" + minuteInTheHour + ":" + secondsInThisMinute + " " + amPm);
    }
}
