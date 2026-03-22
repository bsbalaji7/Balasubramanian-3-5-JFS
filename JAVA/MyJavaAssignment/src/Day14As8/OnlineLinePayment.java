package Day14As8;

//PC
class payment{
	void ProcessPayment(){
		System.out.println("Processing Payment...");
	}
}



//CC
class CreditPayment extends payment{
	@Override
	void ProcessPayment(){
		System.out.println("Processing Payment with credit card");
	}
}


//CC
class DebitPayment extends payment{
	@Override
	void ProcessPayment(){
		System.out.println("Processing Payment with Debit card");
	}
}


//CC
class UPIPayment extends payment{
	@Override
	void ProcessPayment(){
		System.out.println("Processing Payment with UPI");
	}
}

public class OnlineLinePayment {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		payment p;
		
		p = new CreditPayment();
        p.ProcessPayment();

        p = new DebitPayment();
        p.ProcessPayment();

        p = new UPIPayment();
        p.ProcessPayment();

	}

}
