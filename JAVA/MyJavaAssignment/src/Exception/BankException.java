package Exception;

class InsufficientBalanceException extends Exception{
	InsufficientBalanceException(String msg){
		super(msg);
	}
}


class InvaildAmountException extends Exception{
	InvaildAmountException(String msg){
		super(msg);
	}
}

class Bank{
	double Balance= 5000;
	
	void withdraw(double amount) throws Exception {
		try {
		if(amount < 0) {
			throw new InvaildAmountException("Enter the valid number");
		}
		if(amount > Balance){
			throw new InsufficientBalanceException("Not enough balance");
		}
		
		Balance -= amount;
		System.out.println("Withdraw successful. Balance = " + Balance);
		
		}finally {
			 System.out.println("Transaction Done SuccessFully");
		}	
	}
	
}
public class BankException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b = new Bank();
		try {
			b.withdraw(10000);
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		
		
	}

}
