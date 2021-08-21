package com.thirtydaysofcode.day25;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class RunningTimeAndComplexity {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("src/com/thirtydaysofcode/testcases/day25.txt"));
        int T = sc.nextInt();
        while (T-- > 0){
            int n = sc.nextInt();
            int isPrime = isPrime(n);
            if (isPrime == 1){
                System.out.println("Not prime");
            }else {
                System.out.println("Prime");
            }
        }
    }

    public static int isPrime(int n) {
        int count = 0;
        for (int i = 2; i <= n/i; i++) {
            if (n % i == 0){
                count =1;
            }
        }
        return count;
    }
}
