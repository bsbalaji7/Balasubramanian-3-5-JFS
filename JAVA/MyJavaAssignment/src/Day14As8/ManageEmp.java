package Day14As8;


class Employee{
	void calculateBonus() {
        System.out.println("Calculating general employee bonus...");
    }
}

class Manager extends Employee{
	@Override
	void calculateBonus() {
        System.out.println("Manager Bonus: 20% of salary");
    }
}

class Developer extends Employee{
	@Override
	void calculateBonus() {
        System.out.println("Manager Bonus: 10% of salary");
    }
}


class Intern extends Employee{
	@Override
	void calculateBonus() {
        System.out.println("Manager Bonus: Fixed Stipend");
    }
}



public class ManageEmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee();
		emp = new Manager();
		emp.calculateBonus();
		
		emp = new Developer();
		emp.calculateBonus();
		
		emp = new Intern();
		emp.calculateBonus();
	}

}
