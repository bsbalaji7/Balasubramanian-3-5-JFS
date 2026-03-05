package com.day8.pack;
import java.util.Scanner;
public class ATM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int balance = 10000;
        int withdraw;

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.print("Enter withdrawal amount (0 to exit): ");
            withdraw = sc.nextInt();

            if (withdraw == 0) {
                System.out.println("Transaction Ended");
                break;
            }

            if (withdraw > balance) {
                System.out.println("Insufficient Balance");
            }
            else if (withdraw <= 0) {
                System.out.println("Invalid Amount");
            }
            else {
                balance = balance - withdraw;
                System.out.println("Remaining Balance = " + balance);
            }
        }
	}

}
