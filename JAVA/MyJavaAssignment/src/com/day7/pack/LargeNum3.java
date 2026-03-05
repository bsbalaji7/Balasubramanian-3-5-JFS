package com.day7.pack;

public class LargeNum3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
        int b = 25;
        int c = 15;

        if (a > b && a > c) {
            System.out.println("Largest number is: " + a);
        } 
        else if (b > a && b > c) {
            System.out.println("Largest number is: " + b);
        } 
        else {
            System.out.println("Largest number is: " + c);
        }

	}

}
