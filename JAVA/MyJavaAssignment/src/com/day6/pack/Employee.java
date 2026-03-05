package com.day6.pack;

public class Employee {
	
	
	int EmployeeID;
	double Salary;
	
	void CalucalateSalary() {
		double bonus = Salary * 0.10;
		double TotalSal = Salary + bonus;
		System.out.println("Normal Salary: "+ Salary);
		System.out.println("Bonus: "+ bonus);
		System.out.println("Total Salary:"+ TotalSal);
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee();
		emp.EmployeeID = 1012;
		emp.Salary = 10000;
		
		emp.CalucalateSalary();
	}

}
