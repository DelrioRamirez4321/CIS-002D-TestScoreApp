package edu.whccd.dramirez;

/*
purpose of this application is to test the use of code in 2-18 from chapter 2
author: Delrio Ramirez
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter the test scores that range from 0 - 100");
        System.out.println("To end the program enter 999");
        System.out.println();

        int scoreTotal = 0;
        int scoreCount = 0;
        int testScore = 0;
        Scanner sc = new Scanner(System.in);

        while(testScore <= 100){
            System.out.print("Enter score: ");
            testScore = sc.nextInt();

            if (testScore <= 100){
                scoreCount = scoreCount + 1;
                scoreTotal = scoreTotal + testScore;
            }
        }
        double averageScore = (double) scoreTotal / scoreCount;
        String message = "\n"
                + "Score Count:  " + scoreCount + "\n"
                + "Score Total: " + scoreTotal + "\n"
                +  "Average Score" + averageScore + "\n";
        System.out.println(message);
    }
}
