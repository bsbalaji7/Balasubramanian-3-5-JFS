package com.index.pack;
import java.util.Scanner;
public class Stock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.print("Is item have stock? (true/false): ");
        boolean Stock = sc.nextBoolean();

        double total = 0;   

        if (Stock) {
            System.out.print("Enter total amount: ");
            total = sc.nextDouble();
        }

        System.out.println("Total: " + total);
	}

}
