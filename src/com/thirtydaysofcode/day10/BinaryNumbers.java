package com.thirtydaysofcode.day10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;

public class BinaryNumbers {
    public static void main(String[] args) throws FileNotFoundException {
        //JUST FOR TESTING AND CODING IN IDE
        //Replace File with (System.in) and remove FileNotFoundException from main method
        Scanner in = new Scanner(new File("src/com/thirtydaysofcode/testcases/day10.txt"));
        int n = in.nextInt();
        int rem = 0, s = 0, t = 0;
        while (n > 0) {
            rem = n % 2;
            n = n / 2;
            if (rem == 1) {
                s++;
                if (s >= t)
                    t = s;
            } else {
                s = 0;
            }
        }
        System.out.println(t);
    }
}

