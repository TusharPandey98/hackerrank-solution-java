package com.thirtydaysofcode.day8;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class DictionariesAndMaps {
    public static void main(String[] args) throws FileNotFoundException {
        HashMap<String ,Integer> phoneBook = new HashMap<>();
        //JUST FOR TESTING AND CODING IN IDE
        //Replace File with (System.in) and remove FileNotFoundException from main method
        Scanner sc = new Scanner(new File("src/com/thirtydaysofcode/testcases/day8.txt"));
        String query;
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String name = sc.next().trim();
            int phone = sc.nextInt();
            sc.nextLine();
            phoneBook.put(name, phone);
        }
        while (sc.hasNext()){
            query = sc.nextLine().trim();
            if (phoneBook.containsKey(query)) {
                System.out.println(query + "=" +phoneBook.get(query));
            } else {
                System.out.println("Not found");
            }

        }
    }
}
