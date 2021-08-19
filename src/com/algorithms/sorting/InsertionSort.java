package com.algorithms.sorting;

import java.util.Arrays;

public class InsertionSort {

    public static void insert(int arr[],int rightIndex,int value){
        int j;
        for (j=rightIndex;j>=0 && arr[j]>value;j--){
            arr[j+1] = arr[j];
        }
        arr[j+1] = value;
    }

//    public static void sort(int[] arr) {
//        int n = arr.length;
//        for (int i = 1; i < n; i++) {
//            int key = arr[i];
//            int j = i - 1;
//
//            /**
//             * Move element of arr[0..i-1] that are greater the key ,
//             * to one position ahead of their current position
//             */
//
//            while (j >= 0 && arr[j] > key) {
//                arr[j + 1] = arr[j];
//                j = j - 1;
//            }
//            arr[j + 1] = key;
//        }
//    }
    public static void sort(int arr[]){
        for (int i = 1; i < arr.length; i++) {
            insert(arr,i-1,arr[i]);
        }
    }
    public static void main(String[] args) {
        int[] array = {11, 7, 5, 3, 2};
        sort(array);
        System.out.println(Arrays.toString(array));
    }
}
