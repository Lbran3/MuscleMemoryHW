package chapter4;

import java.util.Scanner;
/*
For LOOP
Write a cashier program that will scan a given number of items and tally the cost
 */
public class LetterSearch {

    public static void main(String[] args) {
        //get text
        System.out.println("Enter some text:");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();
        scanner.close();

        boolean letterFound = false;
        //Search text for letter A
        for(int i = 0; i<text.length(); i++){
            char firstLetter = text.charAt(i);
            if(firstLetter == 'A' || firstLetter == 'a'){
                letterFound = true;
                break;
            }

        }
        if(letterFound){
            System.out.println("This text contains the letter 'A'");

        }
        else {
            System.out.println("This ltext does not contain the letter 'A'");
        }
    }


}
