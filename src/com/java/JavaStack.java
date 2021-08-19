package com.java;

import java.util.Scanner;
import java.util.Stack;

public class JavaStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String input=sc.next();

            balancedString(input);
        }
    }
    public static String balancedString(String testString){
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < testString.length(); i++) {
            if (testString.charAt(i) == '(' || testString.charAt(i) == '{' || testString.charAt(i) == '['){
                stack.push(testString.charAt(i));
            }else {
                if (stack.isEmpty()){
                    return "NO";
                }else {
                    char pop_val = stack.pop();
                    if (testString.charAt(i) == ')' && pop_val != '('){
                        return "NO";
                    }else if (testString.charAt(i) == '}' && pop_val != '{'){
                        return "NO";
                    }else if (testString.charAt(i) == ']' && pop_val != '['){
                        return "NO";
                    }
                }
            }
        }
        if (stack.isEmpty()){
            return "YES";
        }else {
            return "NO";
        }
    }
}
