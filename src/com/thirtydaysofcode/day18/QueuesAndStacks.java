package com.thirtydaysofcode.day18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class QueuesAndStacks {
    Stack<Character> stack = new Stack<>();
    Queue<Character> queue = new LinkedList<>();
    public void pushCharacter(char ch) {
        stack.push(ch);
    }
    public void enqueueCharacter(char ch) {
        queue.add(ch);
    }
    public char popCharacter() {
        return stack.pop();
    }
    public char dequeueCharacter() {
        return queue.remove();
    }

    public static void main(String[] args) throws FileNotFoundException {
        //JUST FOR TESTING AND CODING IN IDE
        //Replace File with (System.in) and remove FileNotFoundException from main method
        Scanner scan = new Scanner(new File("src/com/thirtydaysofcode/testcases/day18.txt"));
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        QueuesAndStacks p = new QueuesAndStacks();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length / 2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println("The word, " + input + ", is "
                + ((!isPalindrome) ? "not a palindrome." : "a palindrome."));
    }
}

