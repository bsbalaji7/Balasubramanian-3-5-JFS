package Assignment9;


interface payment{
	void processPayment(double amount);
}

class CreditCard implements payment{
	public void processPayment(double amount) {
		System.out.println("Processing Credit Card Payment of ₹" + amount);
        System.out.println("Validating card details...");
        System.out.println("Payment Successful via Credit Card!\n");
	}
}


class UPI implements payment{
	public void processPayment(double amount) {
		System.out.println("Processing UPI Payment of ₹" + amount);
        System.out.println("UPI process");
        System.out.println("Payment Successful via UPI\n");
	}
}

class PayPal implements payment{
	public void processPayment(double amount) {
		System.out.println("Processing PayPal  Payment of ₹" + amount);
        System.out.println("Validating PayPal details...");
        System.out.println("Payment Successful via PayPal \n");
	}
}

public class OnlinePayment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		payment p1 = new CreditCard();
        payment p2 = new UPI();
        payment p3 = new PayPal();

        p1.processPayment(5000);
        p2.processPayment(1500);
        p3.processPayment(3000);
	}

}
