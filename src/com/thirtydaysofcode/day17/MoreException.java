package com.thirtydaysofcode.day17;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class Calculator {
    public int power(int n, int p) throws Exception {
        int result = 0;
        if (n >= 0 && p >= 0) {
            result = (int) Math.pow(n, p);
            return result;
        } else if (n < 0 || p < 0) {
            throw new Exception("n and p should be non-negative");
        } else {
            throw new Exception("n and p should be non-negative");
        }
    }
}

public class MoreException {
    public static void main(String[] args) throws FileNotFoundException {
        //JUST FOR TESTING AND CODING IN IDE
        //Replace File with (System.in) and remove FileNotFoundException from main method
        Scanner in = new Scanner(new File("src/com/thirtydaysofcode/testcases/day17.txt"));
        int t = in.nextInt();
        while (t-- > 0) {

            int n = in.nextInt();
            int p = in.nextInt();
            Calculator myCalculator = new Calculator();
            try {
                int ans = myCalculator.power(n, p);
                System.out.println(ans);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        in.close();
    }
}
