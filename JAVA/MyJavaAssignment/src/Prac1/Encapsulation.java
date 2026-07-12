package Prac1;

class Student{
	private int id;
	
	
	public void setid(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}
	
}

public class Encapsulation {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();
		s.setid(67);
		System.out.println(s.getId());
	}

}
