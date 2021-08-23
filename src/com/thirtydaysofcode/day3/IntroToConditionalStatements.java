package com.thirtydaysofcode.day3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class IntroToConditionalStatements {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("src/com/thirtydaysofcode/testcases/day3.txt"));
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        if (N % 2 == 1) {
            System.out.println("Weird");
        }
        if (N % 2 == 0 && N < 5) {
            System.out.println("Not Weird");
        }
        if (N % 2 == 0 && N >= 6 && N <= 20) {
            System.out.println("Weird");
        }
        if (N % 2 == 0 && N > 20) {
            System.out.println("Not Weird");
        }
        scanner.close();
    }

}

