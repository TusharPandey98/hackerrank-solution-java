package com.thirtydaysofcode.day28;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexPatterns {
    public static void main(String[] args) throws FileNotFoundException {
        //JUST FOR TESTING AND CODING IN IDE
        //Replace File with (System.in) and remove FileNotFoundException from main method
        Scanner sc = new Scanner(new File("src/com/thirtydaysofcode/testcases/day28.txt"));
        int N = sc.nextInt();
        //Regular Expression
        String myRegexString = ".+@gmail\\.com$";
        //Create a Pattern Object
        Pattern pattern = Pattern.compile(myRegexString);
        List<String> matched = new ArrayList<>();
        for (int i = 0; i <N; i++) {
            String firstName = sc.next();
            String emailID = sc.next();
            // Matcher
            Matcher matcher = pattern.matcher(emailID);
            //If our matcher finds a match
            if (matcher.find()) {
                matched.add(firstName);
            }
        }
        //Sort the list
        Collections.sort(matched);
        //Display the sorted result list
        for (String s:matched){
            System.out.println(s);
        }
    }
}
