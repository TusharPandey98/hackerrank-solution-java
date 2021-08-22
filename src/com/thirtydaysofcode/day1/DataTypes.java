package com.thirtydaysofcode.day1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DataTypes {
    public static void main(String[] args) throws FileNotFoundException {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(new File("src/com/thirtydaysofcode/testcases/day1.txt"));

        /* Declare second integer, double, and String variables. */
        int secondInt;
        double secondDouble;
        String secondString;
        /* Read and save an integer, double, and String to your variables.*/
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.
        secondInt = scan.nextInt();
        secondDouble = scan.nextDouble();
        scan.nextLine();
        secondString = scan.nextLine();
        /* Print the sum of both integer variables on a new line. */
        System.out.println(i+secondInt);
        /* Print the sum of the double variables on a new line. */
        System.out.println(d+secondDouble);
        /* Concatenate and print the String variables on a new line;
        	the 's' variable above should be printed first. */
        System.out.println((s+secondString));
        scan.close();
    }
}
