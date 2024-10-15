package chapter2;

import java.util.Scanner;

public class GrossPayCalculator {

    public static void main(String[] args) {
        //get # of hours worked
        System.out.println("Enter # of hours the employee worked: ");
        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt();

        //get hourly pay rate
        System.out.println("Enter employee's pay rate: ");
        double payRate = scanner.nextDouble();

        //multiply hours and pay rate
        double grossPay = hours * payRate;

        //display result
        System.out.println("The employees gross pay is: $" + grossPay);
        //--------------------------------------------------------------------------
        //create program that ask user for season
        System.out.println("Enter a season of the year: ");
        String season = scanner.next();

        //incorporate/ask for a whole number for cups of coffee
        System.out.println("Enter a whole number:");
        int wholeNumber = scanner.nextInt();

        //incorporate an adjective describing type of day
        System.out.println("Enter an adjective:");
        String adjective = scanner.next();
        scanner.close();

        //display output as "On a [adjective] [season] day, I drink a minimum of [#] cups of coffee"
        System.out.println("On a " + adjective + " " + season + " day, I drink a minimum of " + wholeNumber + " cups of coffee.");
    }
}
