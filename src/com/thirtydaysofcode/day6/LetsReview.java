package com.thirtydaysofcode.day6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LetsReview {
    public static void main(String[] args) throws FileNotFoundException {
        //JUST FOR TESTING AND CODING IN IDE
        //Replace File with (System.in) and remove FileNotFoundException from main method
        Scanner sc = new Scanner(new File("src/com/thirtydaysofcode/testcases/day6.txt"));
        int noOfTestCase;
        String givenString;
        String even = "";
        String odd = "";
        noOfTestCase = sc.nextInt();

        for (int i = 0; i < noOfTestCase; i++) {
            givenString = sc.next();

            for (int j = 0; j < givenString.length(); j++) {
                if (j % 2 == 0) {
                    even += givenString.charAt(j);
                } else {
                    odd += givenString.charAt(j);
                }
            }
            System.out.println(even + " " + odd);
            odd = "";
            even = "";
        }
    }
}

