package chapter5;

import java.util.Scanner;

/*
First Method
write a method that asks a user for their name, then greets them by name
 */
public class Greetings {

    public static void main(String[] args) {
        System.out.println("Enter you name:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        greetUser(name);
    }

    public static void greetUser(String name){
        System.out.println("Hello," + name);
    }
}
