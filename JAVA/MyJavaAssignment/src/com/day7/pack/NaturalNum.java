package com.day7.pack;

public class NaturalNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5; 
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }

        System.out.println("Sum of first " + n + " natural numbers is: " + sum);
	}

}
