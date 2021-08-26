package com.thirtydaysofcode.day21;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class Printer<T>{
    public void printArray(T[] Array) {
        for (T s:Array){
            System.out.println(s);
        }
    }
}
public class Generics {

    public static void main(String args[]) throws FileNotFoundException {
        //JUST FOR TESTING AND CODING IN IDE
        //Replace File with (System.in) and remove FileNotFoundException from main method
        Scanner scanner = new Scanner(new File("src/com/thirtydaysofcode/testcases/day21.txt"));
        int n = scanner.nextInt();
        Integer[] intArray = new Integer[n];
        for (int i = 0; i < n; i++) {
            intArray[i] = scanner.nextInt();
        }

        n = scanner.nextInt();
        String[] stringArray = new String[n];
        for (int i = 0; i < n; i++) {
            stringArray[i] = scanner.next();
        }

        Printer<Integer> intPrinter = new Printer<Integer>();
        Printer<String> stringPrinter = new Printer<String>();
        intPrinter.printArray(intArray);
        stringPrinter.printArray(stringArray);
        if (Printer.class.getDeclaredMethods().length > 1) {
            System.out.println("The Printer class should only have 1 method named printArray.");
        }
    }
}
