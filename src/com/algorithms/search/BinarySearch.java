package com.algorithms.search;

public class BinarySearch {
    public static int binarySearch(int[] arr, int targetValue) {
        int min =0;
        int max = arr.length -1;
        int guess;
        while (min<=max){
            guess = Math.round((min + max)/2);
            if (arr[guess] == targetValue){
                return guess;
            }else if (arr[guess] < targetValue){
                min = guess+1;
            }else {
                max = guess -1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37,
                41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
        int result = binarySearch(primes,43);
        System.out.println("Found prime at index " + result);

    }
}
