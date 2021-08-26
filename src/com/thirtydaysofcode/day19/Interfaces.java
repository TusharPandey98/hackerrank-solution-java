package com.thirtydaysofcode.day19;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

interface AdvancedArithmetic {
    int divisorSum(int n);
}

class MyCalculator implements AdvancedArithmetic {
    @Override
    public int divisorSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i ==0){
                sum += i;
            }
        }
        return sum;
    }
}

public class Interfaces {
    public static void main(String[] args) throws FileNotFoundException {
        //JUST FOR TESTING AND CODING IN IDE
        //Replace File with (System.in) and remove FileNotFoundException from main method
        Scanner scan = new Scanner(new File("src/com/thirtydaysofcode/testcases/day19.txt"));
        int n = scan.nextInt();
        scan.close();

        AdvancedArithmetic myCalculator = new MyCalculator();
        int sum = myCalculator.divisorSum(n);
        System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName());
        System.out.println(sum);
    }
}

