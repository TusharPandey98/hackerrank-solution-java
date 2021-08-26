package com.thirtydaysofcode.day5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Loops {
    public static void main(String[] args) throws FileNotFoundException {
        //JUST FOR TESTING AND CODING IN IDE
        //Replace File with (System.in) and remove FileNotFoundException from main method
        Scanner scanner = new Scanner(new File("src/com/thirtydaysofcode/testcases/day5.txt"));
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        for(int i=1;i<=10;i++)
        {
            System.out.printf("%d x %d = %d",n,i,n*i);
            System.out.println();
        }
        scanner.close();
    }
}
