package Day12As7;

class Employee{
	int EmpId;
	String EmpName;
	double EmpSalary;
	
	Employee(int Id, String Name, double Salary){
		EmpId = Id;
		EmpName = Name;
		EmpSalary = Salary;
				
	}
	
	void DisplayEmployee() {
		System.out.println("Employee ID: " + EmpId);
        System.out.println("Employee Name: " + EmpName);
        System.out.println("Salary: " + EmpSalary);
        System.out.println();
	}
	
}

public class EmpSalaIniz {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee e1 = new Employee(101, "Arun", 30000);
        Employee e2 = new Employee(102, "Bala", 40000);
        Employee e3 = new Employee(103, "Kiran", 50000);

        
        e1.DisplayEmployee();
        e2.DisplayEmployee();
        e3.DisplayEmployee();
	}

}
