package Day12As7;

class BankAccount {
    int accountNumber;
    String accountHolderName;
    double balance;
    
    BankAccount(int accNo, String name, double bal) {
        accountNumber = accNo;
        accountHolderName = name;
        balance = bal;
    }

    void deposit(double amount) {
        balance = balance + amount;
    }
    void displayBalance() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }
}

public class BAS {
    public static void main(String[] args) {

        // Creating acc object
        BankAccount acc1 = new BankAccount(1001, "Arun", 5000);

        // Deposit money
        acc1.deposit(2000);

        acc1.displayBalance();
    }
}