package chapter3;

import java.util.Scanner;

/*
IF Else
-all salespeople expected to make at least 10 sales each wk
-for those who do, they receive a congratulatory message
-those who don't, are informed of how many sales they were short
 */
public class QuotaCalculator {

    public static void main(String[] args) {

        //initialize values we know
        int quota = 10;

        //get unknown values
        System.out.println("Enter number of sales you made this week: ");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        //make a decision on the path to take - output
        if(sales >= quota){
            System.out.println("Congrats! You've met your quota");
        }
        else{
            int salesShort = quota - sales;
            System.out.println("You did not meet you quota. You were " + salesShort + " sales short");
        }
    }
}
