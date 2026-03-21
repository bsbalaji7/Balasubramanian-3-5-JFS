package Day12As7;

class Student {
    int studentId;
    String studentName;
    int marks;

    // Parameterized Constructor
    Student(int id, String name, int m) {
        studentId = id;
        studentName = name;
        marks = m;
    }

    // Method to calculate grade
    String calculateGrade() {
        if (marks >= 90)
            return "Grade A";
        else if (marks >= 75)
            return "Grade B";
        else if (marks >= 50)
            return "Grade C";
        else
            return "Fail";
    }

    void display() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Student Name: " + studentName);
        System.out.println("Marks: " + marks);
        System.out.println("Result: " + calculateGrade());
        System.out.println();
    }
}

public class SGS {
    public static void main(String[] args) {

        // Creating 2 student objects
        Student s1 = new Student(1, "Arun", 92);
        Student s2 = new Student(2, "Bala", 68);

        // Display details with grade
        s1.display();
        s2.display();
    }
}
