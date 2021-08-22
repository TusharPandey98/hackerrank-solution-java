package com.thirtydaysofcode.day26;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class NestedLogic {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("src/com/thirtydaysofcode/testcases/day26.txt"));
        int d1, d2, m1, m2, y1, y2;
        d1 = sc.nextInt();
        m1 = sc.nextInt();
        y1 = sc.nextInt();
        d2 = sc.nextInt();
        m2 = sc.nextInt();
        y2 = sc.nextInt();
        int fine = 0;
        LocalDate returnDate = LocalDate.of(y1, m1, d1);
        LocalDate dueDate = LocalDate.of(y2, m2, d2);
        if (returnDate.isAfter(dueDate)) {
            if (dueDate.getYear() == returnDate.getYear()) {
                if (dueDate.getMonth() == returnDate.getMonth()) {
                    int differDays = (int) ChronoUnit.DAYS.between(dueDate, returnDate);
                    fine = 15 * differDays;
                } else {
                    int differMonths = (int) ChronoUnit.MONTHS.between(dueDate, returnDate);
                    fine = 500 * differMonths;
                }
            } else {
                fine = 10000;
            }
        }
        System.out.println(fine);
    }
}
