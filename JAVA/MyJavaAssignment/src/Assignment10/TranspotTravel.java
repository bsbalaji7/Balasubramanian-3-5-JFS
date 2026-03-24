package Assignment10;


abstract class Transport {
    abstract void bookTicket();
}

class Bus extends Transport {
    void bookTicket() {
        System.out.println("Bus ticket bookd successfully.");
    }
}

class Train extends Transport {
    void bookTicket() {
        System.out.println("Train ticket booked successfully.");
    }
}


public class TranspotTravel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Transport t;

	        t = new Bus();
	        t.bookTicket();

	        t = new Train();
	        t.bookTicket();
		
	}

}
