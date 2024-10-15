package chapter4;

import java.util.Scanner;

//FOR LOOP
//write a cashier program that will scan a given number of item and tally the cost
public class Cashier {
    public static void main(String[] args) {

        //get number of items to scan
        System.out.println("Enter number of items you would like to scan:");
        Scanner scanner = new Scanner(System.in);
        int quantity = scanner.nextInt();
        scanner.close();

        double total = 0;

        //create loop to iterate through all of the items and accumulate the costs
        for(int i = 0; i < quantity; i++){

            System.out.println("Enter the cost of the item:");
            double price = scanner.nextDouble();

            total = total + price;

        }
        scanner.close();
        System.out.println("Your total is $" + total);
    }



}
