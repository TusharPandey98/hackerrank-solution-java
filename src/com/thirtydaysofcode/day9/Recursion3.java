package com.thirtydaysofcode.day9;

import java.util.Scanner;

public class Recursion3 {
    public static int factorial(int n){
        if (n <= 1){
            return 1;
        }
        return n * factorial(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = factorial(n);
        sc.close();
        System.out.println(result);
    }
}