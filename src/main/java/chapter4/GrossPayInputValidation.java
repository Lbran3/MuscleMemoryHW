package chapter4;

import java.util.Scanner;

/*
While Loop
-each store employee makes $15 an hour.
-Write a program that allows the employee to enter # of hours worked for the week.
- Do not allow overtime
 */
public class GrossPayInputValidation {

    public static void main(String[] args) {
        //Initialize known variables
        int employeeHourlyPay = 15;
        int maxHours = 40;

        //get input for unknown variables
        System.out.println("How many hours did you work this week? ");
        Scanner scanner = new Scanner(System.in);
        double hoursWorked = scanner.nextDouble();

        //Validate input
        while(hoursWorked > maxHours || hoursWorked < 1){
            System.out.println("Invalid entry, your hours must be between 1-40. Try again.");
            hoursWorked = scanner.nextDouble();
        }

        scanner.close();
        double gross = employeeHourlyPay * hoursWorked;
        System.out.println("Gross pay: $" + gross);
    }
}
