package Day10As6;


class Employee {

    int empId;
    String empName;

    // Default Constructor
    Employee() {
        empId = 100;
        empName = "Not Assigned";
    }

    void display() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
    }
}

public class Notassigned {

    public static void main(String[] args) {

        // Object created without giving details
        Employee e1 = new Employee();

        e1.display();
    }
}
