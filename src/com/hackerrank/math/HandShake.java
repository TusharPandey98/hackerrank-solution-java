package com.hackerrank.math;


import java.io.*;
import java.util.stream.IntStream;

class Result {
    public static int handshake(int n) {
        int result = n * (n - 1) / 2;
        return result;
    }
}

public class HandShake {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));


        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                int n = Integer.parseInt(bufferedReader.readLine().trim());

                int result = Result.handshake(n);
                System.out.println(result);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();

    }
}

