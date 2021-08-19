package com.thirtydaysofcode;

import java.util.Scanner;

class Person {
    protected String firstName;
    protected String lastName;
    protected int idNumber;

    public Person(String firstName, String lastName, int idNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = idNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName.length() >= 1 && firstName.length() <= 10) {
            this.firstName = firstName;
        }
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (lastName.length() >= 1 && lastName.length() <= 10) {
            this.lastName = lastName;
        }
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        if (String.valueOf(idNumber).length() == 7) {
            this.idNumber = idNumber;
        }
    }

    public void printPerson() {
        System.out.println("Name:" + getLastName() + ", " + getFirstName() + "\nID: " + getIdNumber());
    }
}

class Student extends Person {
    int[] scores;

    Student(String firstName, String lastName, int idNumber, int scores[]) {
        super(firstName, lastName, idNumber);
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = idNumber;
        this.scores = scores;
    }

    public char calculate() {
        int avg = 0;
        for (int number : scores) {
            avg += number;
        }
        avg = avg / scores.length;
        if ((avg >= 90) && (avg <= 100)) {
            return 'O';
        } else if ((avg >= 80) && (avg < 90))
            return 'E';

        else if ((avg >= 70) && (avg < 80))
            return 'A';

        else if ((avg >= 55) && (avg < 70))
            return 'P';

        else if ((avg >= 40) && (avg < 55))
            return 'D';

        else
            return 'T';
    }

}

public class Inheritance {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstName = scan.next();
        String lastName = scan.next();
        int id = scan.nextInt();
        int numScores = scan.nextInt();
        int[] testScores = new int[numScores];
        for (int i = 0; i < numScores; i++) {
            testScores[i] = scan.nextInt();
        }
        scan.close();

        Student s = new Student(firstName, lastName, id, testScores);
        s.printPerson();
        System.out.println("Grade: " + s.calculate());
    }
}
