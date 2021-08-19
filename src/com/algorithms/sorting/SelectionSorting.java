package com.algorithms.sorting;

import java.util.Arrays;

class SelectionSorting {

    public static void sort(int[] array) {
        //Length of the array
        int n = array.length;

        //One by one move boundary of array
        for (int i = 0; i < n - 1; i++) {

            //find the minimum element in the array
            int minimum_index = i;

            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minimum_index]) {
                    minimum_index = j;
                }
            }
            //swap the found minimum element with the first element
            int temp = array[minimum_index];
            array[minimum_index] = array[i];
            array[i] = temp;
        }
    }


    public static void display(int[] array) {
        System.out.println(Arrays.toString(array)); // [John, Mary, Bob]
    }


    public static void main(String[] args) {
        int[] array = {1, 4, 9, 3, 2, 5, 10};
        sort(array);
        display(array);


    }
}