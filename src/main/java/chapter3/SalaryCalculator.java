package chapter3;

import java.util.Scanner;

/*
IF Statement
all sale ppl get paid $1000 a wk
if sales ppl exceed 10 sales, add additional bonus of $250
 */
public class SalaryCalculator {

    public static void main(String[] args) {

        //initialize known values
        int salary = 1000;
        int bonus = 250;
        int quota = 10;

        //get values for the unknown
        System.out.println("How many sales did the employee make this week?");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        // detour for the bonus earners
        if(sales > quota){ //
            salary = salary + bonus;
        }
        //output
        System.out.println("The employees pay is: $" + salary);
    }

}
