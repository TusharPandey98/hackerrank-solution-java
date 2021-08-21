package com.thirtydaysofcode.day13;

import java.util.Scanner;

abstract class Book{
    String title;
    String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    abstract void display();
}

class MyBook extends Book{
    int price;

    public MyBook(String title, String author, int price) {
        super(title, author);
        this.price = price;
    }

    @Override
    void display() {
        System.out.println("Title: "+title +"\nAuthor: "+author
        +"\nPrice: "+price);
    }
}
public class AbstractClasses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String title = scanner.nextLine();
        String author = scanner.nextLine();
        int price = scanner.nextInt();
        scanner.close();

        Book book = new MyBook(title, author, price);
        book.display();
    }
}
