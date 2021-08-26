package com.thirtydaysofcode.day25;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class RunningTimeAndComplexity {
    public static void main(String[] args) throws FileNotFoundException {
        //JUST FOR TESTING AND CODING IN IDE
        //Replace File with (System.in) and remove FileNotFoundException from main method
        Scanner sc = new Scanner(new File("src/com/thirtydaysofcode/testcases/day25.txt"));
        int T = sc.nextInt();
        while (T-- > 0){
            int n = sc.nextInt();
            if (!isPrime(n)){
                System.out.println("Not prime");
            }else {
                System.out.println("Prime");
            }
        }
    }

    public static boolean isPrime(int n) {
        if (n <= 1){
            return false;
        }
        else if (n==2){
            return true;
        }
        else if (n % 2 ==0){
            return false;
        }
        for (int i = 3; i <= Math.sqrt(n); i+=2) {
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }
}
