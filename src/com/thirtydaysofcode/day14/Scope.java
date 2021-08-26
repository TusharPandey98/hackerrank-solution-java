package com.thirtydaysofcode.day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class Difference{
    private int[] elements;
    public int maximumDifference;

    public Difference(int[] elements) {
        this.elements = elements;
    }

    void computeDifference(){
        int min = elements[0];
        int max = elements[0];
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] < min){
                min = elements[i];
            }
            if(elements[i] > max){
                max = elements[i];
            }
        }
        maximumDifference = max - min;
    }
}
public class Scope {
    public static void main(String[] args) throws FileNotFoundException {
        //JUST FOR TESTING AND CODING IN IDE
        //Replace File with (System.in) and remove FileNotFoundException from main method
        Scanner sc = new Scanner(new File("src/com/thirtydaysofcode/testcases/day14.txt"));
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}
