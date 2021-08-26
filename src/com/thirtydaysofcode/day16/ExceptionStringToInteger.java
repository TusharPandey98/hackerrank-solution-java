package com.thirtydaysofcode.day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionStringToInteger {
    public static void main(String[] args) throws FileNotFoundException {
        //JUST FOR TESTING AND CODING IN IDE
        //Replace File with (System.in) and remove FileNotFoundException from main method
        Scanner sc = new Scanner(new File("src/com/thirtydaysofcode/testcases/day16.txt"));
        String S = sc.nextLine();
        try {
            int number = Integer.parseInt(S);
            System.out.println(number);
        }catch (Exception e){
            System.out.println("Bad String");
        }
        sc.close();
    }
}
