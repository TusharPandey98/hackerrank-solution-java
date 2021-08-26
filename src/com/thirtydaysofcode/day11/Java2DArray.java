package com.thirtydaysofcode.day11;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

//        1 1 1 0 0 0
//        0 1 0 0 0 0
//        1 1 1 0 0 0
//        0 0 0 0 0 0
//        0 0 0 0 0 0
//        0 0 0 0 0 0
public class Java2DArray {
    static int hourGlassSum(int[][] arr) {
        int row = arr.length;
        int col = arr[0].length;

        int max_hourglass_sum = Integer.MIN_VALUE;
        for (int i = 0; i < row - 2; i++) {
            for (int j = 0; j < col - 2; j++) {
                int current_hourglass_sum = arr[i][j] + arr[i][j + 1] + arr[i][j + 2] +
                        arr[i + 1][j + 1] + arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2];
                max_hourglass_sum = Math.max(max_hourglass_sum, current_hourglass_sum);
            }
        }
        return max_hourglass_sum;
    }

    public static void main(String[] args) throws IOException {
        //JUST FOR TESTING AND CODING IN IDE
        //Replace File with (System.in) and remove FileNotFoundException from main method
        Scanner sc = new Scanner(new File("src/com/thirtydaysofcode/testcases/day11.txt"));
        int arr[][] = new int[6][6];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int result = hourGlassSum(arr);
        System.out.println(result);
    }
}
