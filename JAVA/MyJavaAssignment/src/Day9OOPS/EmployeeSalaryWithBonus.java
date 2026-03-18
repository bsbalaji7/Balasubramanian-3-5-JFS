package Day9OOPS;

import java.util.Scanner;



class Employee{
	int empId;
	String empName;
	double basicSalary;
	
	void getData(Scanner sc) {
		System.out.print("Enter Emp ID");
		empId = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Enter Emp name: ");
		empName = sc.nextLine();
		
		System.out.print("Enter Emp Salary: ");
		basicSalary = sc.nextDouble();

	}
	
	
	void calculateSalary() {
		double HRA = 0.20*basicSalary;
		double DA = 0.10*basicSalary;

		double grossSalary = basicSalary + HRA + DA;
		
		if (basicSalary > 50000) {
            double bonus = 0.05 * basicSalary;
            grossSalary += bonus;
        }

        System.out.println("\nEmployee ID: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Gross Salary: " + grossSalary);

	}
	
	
}


public class EmployeeSalaryWithBonus {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner sc = new Scanner(System.in);

	        Employee e1 = new Employee();
	        Employee e2 = new Employee();
	        Employee e3 = new Employee();

	        System.out.println("Enter details for Employee 1");
	        e1.getData(sc);
	        e1.calculateSalary();

	        System.out.println("Enter details for Employee 2");
	        e2.getData(sc);
	        e2.calculateSalary();

	        System.out.println("Enter details for Employee 3");
	        e3.getData(sc);
	        e3.calculateSalary();

	}

}
