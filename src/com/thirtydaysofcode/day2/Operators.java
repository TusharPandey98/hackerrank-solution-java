package com.thirtydaysofcode.day2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Operators {
    static double tip,tax,totalCost;

    // Complete the solve function below.
    static void solve(double meal_cost, int tip_percent, int tax_percent) {

        tip = (meal_cost*tip_percent)/100;
        tax = (meal_cost*tax_percent)/100;
        totalCost = meal_cost+tax+tip;
        System.out.println(Math.round(totalCost));
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("src/com/thirtydaysofcode/testcases/day2.txt"));
        double meal_cost = scanner.nextDouble();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tip_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tax_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        solve(meal_cost, tip_percent, tax_percent);

        scanner.close();
    }
}
