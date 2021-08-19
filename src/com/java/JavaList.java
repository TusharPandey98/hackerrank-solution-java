package com.java;

import java.util.*;

public class JavaList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String operation;
        int x, y;
        int N = sc.nextInt();
        LinkedList<Integer> numbers = new LinkedList<>();
        for (int i = 0; i < N; i++) {
            numbers.add(sc.nextInt());
        }
        int Q = sc.nextInt();
        for (int i = 0; i < Q; i++) {
            operation = sc.next();
            if (operation.equals("Insert")) {
                x = sc.nextInt();
                y = sc.nextInt();
                numbers.add(x, y);
            } else {
                x = sc.nextInt();
                numbers.remove(x);
            }
        }

        for (Integer number : numbers) {
            System.out.println(number);
        }
    }


}
