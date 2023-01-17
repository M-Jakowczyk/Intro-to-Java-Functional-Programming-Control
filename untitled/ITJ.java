public class ITJ {
   public static void main(String[] args) {

       System.out.println("Hello World!");

       Lesson2();

    }
    public static void Lesson1() {
        // Question 1
        String name = "Adam";

        // Question 2
        double register = 10.0;
        register = register + 5; //Customer pays $5.
        register = register - 2.5; //Customer receives $2.50 as change.
        register = register + 10; //Customer pays $10.
        register = register - 3; //Customer receives $3 as change.
        System.out.println(register);

        // Question 3
        int bankBalance = 500;
        bankBalance = bankBalance + 250;
        bankBalance = bankBalance - 100;
        System.out.println(bankBalance);

        // Question 4
        System.out.println(2.0 * (5 / 2));

        // Question 5
        int day;
        String month;
        day = 20;
        month = "December";


        // Question 6
        String firstName = "Mat";
        String lastName = "Jak";
        String fullName = firstName+" "+lastName;

        System.out.println("Hello, my name is "+fullName+".");
        System.out.println("There are "+(firstName.length()+lastName.length())+" letters in my name.");

        // Question 7
        double fahrenheit = 50.0;
        double celsius = (fahrenheit - 32) * 5 / 9;
        System.out.println(celsius);
    }
    public static void Lesson2() {
       // Question 1
        double balance = 0;
        balance = balance + 20; //Add quarter 1 profits (thousands).
        balance = balance - 25; //Subtract quarter 1 expenses (thousands).
        balance = balance + 30; //Add quarter 2 profits (thousands).
        balance = balance - 25; //Subtract quarter 1 expenses (thousands).
        if (balance < 0) {
            System.out.println("We’re in the red!");
        } else if (balance > 0) {
            System.out.println("We made a profit!");
        } else {
            System.out.println("We broke even.");
        }
        /* We broke even */

        // Question 2
        int dogs = 1;
        int cats = 2;
        if (dogs > 0 && cats == 0) {
            if (dogs > 1) {
                System.out.println("Dog lover");
            } else {
                System.out.println("Dog person");
            }
        } else if (cats > 0 && dogs == 0) {
            if (cats > 1) {
                System.out.println("Cat lover");
            } else {
                System.out.println("Cat person");
            }
            System.out.println("Meow!");
        } else if (cats > 0 && dogs > 0) {
            if (dogs > cats) {
                System.out.println("I guess you like dogs more");
            } else if (dogs == cats) {
                System.out.println("I guess you like both equally");
            } else {
                System.out.println("I guess you like cats more");
            }
        } else {
            System.out.println("What, don’t you like pets?");
        }
        /* I guess you like cats more */

        // Question 3
        boolean canSeePlayer = true;
        boolean playerPoweredUp = false;
        if (canSeePlayer) {
            if (!playerPoweredUp) {
                System.out.println("Attack!");
            } else {
                System.out.println("Run away!");
            }
        } else {
            System.out.println("Wander.");
        }

        // Question 4
        boolean isSnowing = false;
        boolean isRaining = true;
        double temperature = 60.0; //Fahrenheit degrees

        if (isSnowing || isRaining || temperature < 50.0){
            System.out.println("Let's stay home.");
        }
        else {
            System.out.println("Let's go out!");
        }

        // Question 5
        int time = 18;
        String timeOfDay;

        if (time >= 5 && time < 12) {timeOfDay = "morning";}
        else if (time >= 12 && time < 20) {timeOfDay = "daytime";}
        else {timeOfDay = "night";}
        System.out.println(timeOfDay);

        // Question 6
        int weekday = 5;
        boolean holiday = false;

        if (weekday >= 1 && weekday <= 5 && !holiday){
            System.out.println("Wake up at 7:00");
        }
        else {System.out.println("Sleep in!");}

        // Question 7
        double playbackPosition = 120;
        boolean rewinding = true;
        if (rewinding) {
            double rewindAmount = 0.1;
            playbackPosition = playbackPosition - rewindAmount;
        }
        /* variable 'rewindAmount' works only in IF scope */

        // Question 8
        int dayOfTheWeek = 1;
        String schedule;

        switch(dayOfTheWeek){
            case 1: schedule = "Gym in the morning"; break;
            case 2: schedule = "Class after work"; break;
            case 3: schedule = "Meeting all day"; break;
            case 4: schedule = "Work from home"; break;
            case 5: schedule = "Game night after work"; break;
            case 6,7: schedule = "Free!"; break;
            default: schedule = "Wrong number day of the week";
        }
        System.out.print("Day of week: "+ dayOfTheWeek+ " : ");
        System.out.println(schedule);

    }
}
