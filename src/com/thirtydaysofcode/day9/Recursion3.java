package com.thirtydaysofcode.day9;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Recursion3 {
    public static int factorial(int n){
        if (n <= 1){
            return 1;
        }
        return n * factorial(n-1);
    }
    public static void main(String[] args) throws FileNotFoundException {
        //JUST FOR TESTING AND CODING IN IDE
        //Replace File with (System.in) and remove FileNotFoundException from main method
        Scanner sc = new Scanner(new File("src/com/thirtydaysofcode/testcases/day9.txt"));
        int n = sc.nextInt();
        int result = factorial(n);
        sc.close();
        System.out.println(result);
    }
}
