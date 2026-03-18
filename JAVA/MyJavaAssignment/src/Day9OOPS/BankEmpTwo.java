package Day9OOPS;

import java.util.Scanner;

class BankAccount {

    int accountNumber;
    String name;
    double balance;

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient Balance!");
        } else {
            balance -= amount;
        }
    }

    void displayBalance() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + name);
        System.out.println("Balance: " + balance);
        System.out.println("---------------------");
    }
}

public class BankEmpTwo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BankAccount a1 = new BankAccount();
        BankAccount a2 = new BankAccount();

        // Acc1
        System.out.println("Enter Account 1 Details");
        a1.accountNumber = sc.nextInt();
        sc.nextLine();
        a1.name = sc.nextLine();
        a1.balance = sc.nextDouble();

        a1.deposit(2000);
        a1.withdraw(1000);
        a1.displayBalance();

        // Acc 2
        System.out.println("Enter Account 2 Details");
        a2.accountNumber = sc.nextInt();
        sc.nextLine();
        a2.name = sc.nextLine();
        a2.balance = sc.nextDouble();

        a2.deposit(3000);
        a2.withdraw(5000); 
        a2.displayBalance();
    }
}
