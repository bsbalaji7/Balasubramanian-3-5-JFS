package com.day8.pack;

public class Counter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		        int num = 45892;
		        int count = 0;

		        while (num != 0) {
		            num = num / 10;   // remove last digit
		            count++;          // increase digit count
		        }

		        System.out.println("Number of digits = " + count);
	}

}
