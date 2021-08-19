package com.java;

import java.util.HashMap;
import java.util.Scanner;

public class JavaMap {
    public static void main(String[] args) {
        HashMap<String ,Integer> phoneBook = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        String query;
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String name = sc.nextLine().trim();
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
