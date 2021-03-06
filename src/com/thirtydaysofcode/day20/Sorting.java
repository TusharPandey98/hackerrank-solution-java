package com.thirtydaysofcode.day20;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * Bubble Sort
 **/
public class Sorting {
    public static void main(String[] args) throws IOException {
        //JUST FOR TESTING AND CODING IN IDE
        //Replace File with (System.in) and remove FileNotFoundException from main method
        Scanner sc = new Scanner(new File("src/com/thirtydaysofcode/testcases/day20.txt"));
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int swapCount = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    swapCount++;
                }
            }
            if (swapCount == 0){
                break;
            }
        }

        System.out.println("Array is sorted in " + swapCount + " swaps.");
        System.out.println("First Element: "+a[0]);
        System.out.println("Last Element: "+a[n-1]);
        sc.close();
    }

}
