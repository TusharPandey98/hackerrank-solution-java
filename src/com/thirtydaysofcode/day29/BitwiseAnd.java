package com.thirtydaysofcode.day29;

import java.io.*;
import java.util.Scanner;

class Result {
    /*
     * Complete the 'bitwiseAnd' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER N
     *  2. INTEGER K
     */

    public static int bitwiseAnd(int N, int K) {
        int max = 0;
        for (int i = 1; i <= N; i++) {
            for (int j = i + 1; j <= N; j++) {
                int result = i & j;
                if (result < K && result > max) {
                    max = result;
                }
            }
        }
        return max;
    }

}

public class BitwiseAnd {
    public static void main(String[] args) throws FileNotFoundException {
        //JUST FOR TESTING AND CODING IN IDE
        //Replace File with (System.in) and remove FileNotFoundException from main method
        Scanner sc = new Scanner(new File("src/com/thirtydaysofcode/testcases/day29.txt"));
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int K = sc.nextInt();
            System.out.println(Result.bitwiseAnd(N, K));
        }
        sc.close();
    }
}
