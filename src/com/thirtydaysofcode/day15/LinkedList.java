package com.thirtydaysofcode.day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

public class LinkedList {
    public static void display(Node head) {
        Node start = head;
        while (start != null) {
            System.out.println(start.data + " ");
            start = start.next;
        }
    }

    public static Node insert(Node head, int data) {
        if (head == null) {
            return new Node(data);
        }
        else if (head.next == null){
            head.next = new Node(data);
        }else{
            insert(head.next,data);
        }
        return head;
    }

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src/com/thirtydaysofcode/testcases/day15.txt");
        Scanner sc = new Scanner(file);
        Node head = null;
        int N = sc.nextInt();

        while (N-- > 0) {
            int ele = sc.nextInt();
            head = insert(head, ele);
        }
        display(head);
        sc.close();
    }
}
