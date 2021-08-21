package com.thirtydaysofcode.day16;

import java.util.Scanner;

public class ExceptionStringToInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
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
