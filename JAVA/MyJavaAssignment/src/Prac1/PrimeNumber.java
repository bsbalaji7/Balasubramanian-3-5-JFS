package Prac1;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num");
		
		int num = sc.nextInt();
		int prime = 0;
		
		for(int i = 1; i <= num ;i++) {
			if(num % i == 0) {
				prime++;
			}
		}
		
		if(prime == 2) {
			System.out.println("Prime");
		}else {
			System.out.println("Not a Prime");
		}
	}

}
