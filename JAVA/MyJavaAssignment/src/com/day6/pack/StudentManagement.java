package com.day6.pack;

import java.util.Scanner;

class Student {

    String studentName;
    int rollNumber;

    void calculateTotal() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks of Subject 1: ");
        int m1 = sc.nextInt();

        System.out.print("Enter marks of Subject 2: ");
        int m2 = sc.nextInt();

        System.out.print("Enter marks of Subject 3: ");
        int m3 = sc.nextInt();

        int totalMarks = m1 + m2 + m3;

        System.out.println("Total Marks = " + totalMarks);
    }
}

public class StudentManagement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Student s1 = new Student();

        System.out.print("Enter Student Name: ");
        s1.studentName = sc.nextLine();

        System.out.print("Enter Roll Number: ");
        s1.rollNumber = sc.nextInt();

        System.out.println("Student Name: " + s1.studentName);
        System.out.println("Roll Number: " + s1.rollNumber);

        s1.calculateTotal();
    }
}