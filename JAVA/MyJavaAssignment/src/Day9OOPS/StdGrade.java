package Day9OOPS;


import java.util.Scanner;

class Student {

    int rollNo;
    String name;
    int mark1, mark2, mark3;

    void getData(Scanner sc) {
        System.out.print("Enter Roll Number: ");
        rollNo = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        name = sc.nextLine();

        System.out.print("Enter Mark 1: ");
        mark1 = sc.nextInt();

        System.out.print("Enter Mark 2: ");
        mark2 = sc.nextInt();

        System.out.print("Enter Mark 3: ");
        mark3 = sc.nextInt();
    }

    void calculateResult() {

        int total = mark1 + mark2 + mark3;
        double average = total / 3.0;
        String grade;

        if (average >= 80)
            grade = "A";
        else if (average >= 60)
            grade = "B";
        else if (average >= 40)
            grade = "C";
        else
            grade = "Fail";

        System.out.println("\nRoll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
        System.out.println("Grade: " + grade);
        System.out.println("----------------------");
    }
}

public class StdGrade {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        Student s4 = new Student();
        Student s5 = new Student();

        System.out.println("Enter details for Student 1");
        s1.getData(sc);
        s1.calculateResult();

        System.out.println("Enter details for Student 2");
        s2.getData(sc);
        s2.calculateResult();

        System.out.println("Enter details for Student 3");
        s3.getData(sc);
        s3.calculateResult();

        System.out.println("Enter details for Student 4");
        s4.getData(sc);
        s4.calculateResult();

        System.out.println("Enter details for Student 5");
        s5.getData(sc);
        s5.calculateResult();

        sc.close();
    }
}