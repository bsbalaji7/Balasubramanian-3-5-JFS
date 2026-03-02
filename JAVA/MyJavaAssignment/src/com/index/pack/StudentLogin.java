package com.index.pack;

public class StudentLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 	String username = "admin";
	        String password = "1234";
	        String status = "invaild credentials";   
	        
	        if(username.equals("admin") && password.equals("1234")) {
	            status = "Login Successful";
	        }
	        
	        System.out.println(status); 
	}

}
