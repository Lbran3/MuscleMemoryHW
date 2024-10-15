package chapter4;

import java.util.Scanner;

/*
NESTED LOOPS
find the average of each student's test score
 */
public class AverageTestScores {

    public static void main(String[] args) {
        //Initialize what we know
        int numberOfStudents = 24;
        int numberOfTests = 4;

        Scanner scanner = new Scanner(System.in);

        //process all the students
        for(int i = 0; i< numberOfStudents; i++){

            double total = 0;
            for(int t =0; t < numberOfTests; t++){
                System.out.println("Enter the score for test #" + (t+1));
            double score = scanner.nextDouble();
            total = total + score;
            }
            double average = total/numberOfTests;
            System.out.println("The test average for student #" + (i+1) + " is " + average);
        }
        scanner.close();
    }

}
