package com.index.pack;

public class StudentGrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int student = 87;
		
		if(student > 90) {
			System.out.println("GRADE: A");
		}else if(student > 80){
			System.out.println("GRADE: B");
		}else if(student > 70){
			System.out.println("GRADE: C");
		}else if(student > 60){
			System.out.println("GRADE: D+");
		}else if(student > 50){
			System.out.println("GRADE: D");
		}else {
			System.out.println("FAIL");
		}
	}

}
