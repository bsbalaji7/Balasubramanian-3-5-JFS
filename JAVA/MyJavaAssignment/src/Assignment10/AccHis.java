package Assignment10;

abstract class Account {
    abstract void calculateInterest();
}

class SavingsAccount extends Account {
    void calculateInterest() {
        System.out.println("Calculating interest for SA at 4%.");
    }
}

class CurrentAccount extends Account {
    void calculateInterest() {
        System.out.println("No interest for CA.");
    }
}

public class AccHis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Account a;

        a = new SavingsAccount();
        a.calculateInterest();

        a = new CurrentAccount();
        a.calculateInterest();
	}

}
