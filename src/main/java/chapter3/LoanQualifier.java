package chapter3;

import java.util.Scanner;

/*
Nested IFs
To qualify for a loan, a person must make at least $30k
The person has to had been working at their job for at least 2 years
 */
public class LoanQualifier {

    public static void main(String[] args) {
       //Initialize what we know
        int requiredSalary = 30000;
        int yearsEmployed = 2;

        //Get what we don't know
        System.out.println("Enter you salary: ");
        Scanner scanner = new Scanner(System.in);
        double salary = scanner.nextDouble();

        System.out.println("Enter number of years with current employer: ");
        double years = scanner.nextDouble();

        scanner.close();

        //Make decision/output
        if(salary >= requiredSalary){
            if(years >= yearsEmployed){
                System.out.println("Congrats, you qualify for the loan!");
            }
            else{
                System.out.println("Sorry, you must have worked at your current job" + requiredSalary + "years");
            }

        }
            else {
            System.out.println("Sorry you must earn at least $" + requiredSalary + " to qualify for the loan");
        }
    }
}
