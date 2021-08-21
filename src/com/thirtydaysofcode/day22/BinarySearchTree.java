package com.thirtydaysofcode.day22;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class Node{
    Node left,right;
    int data;
    Node(int data){
        this.data = data;
        left = right = null;
    }
}
public class BinarySearchTree {
    public static int getHeight(Node root){
        int height;
        if (root == null){
            return -1;
        }
        int leftDepth = getHeight(root.left);
        int rightDepth = getHeight(root.right);
        height = Math.max(leftDepth,rightDepth)+1;
        return height;
    }
    public static Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        } else {
            Node cur;
            if (data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src/com/thirtydaysofcode/testcases/day22.txt");
        Scanner sc = new Scanner(file);
        int T = sc.nextInt();
        Node root = null;
        while (T-- > 0) {
            int data = sc.nextInt();
            root = insert(root, data);
        }
        int height = getHeight(root);
        System.out.println(height);
    }
}
