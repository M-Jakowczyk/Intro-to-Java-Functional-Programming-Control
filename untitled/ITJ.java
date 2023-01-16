public class ITJ {
   public static void main(String[] args) {

       System.out.println("Hello World!");

       Lesson1();

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

}
