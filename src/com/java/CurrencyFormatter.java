package com.java;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyFormatter {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        String us = printCurrency(Locale.US,payment);
        String india = printCurrency( new Locale("en", "IN"),payment);
        String china = printCurrency(Locale.CHINA,payment);
        String france = printCurrency(Locale.FRANCE,payment);

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);

    }

    static String printCurrency(Locale locale,double payment){
        NumberFormat formatter=NumberFormat.getCurrencyInstance(locale);
        String currency=formatter.format(payment);
        return currency;
    }
}
