package Day14As8;

//PC
class Transport {
    void calculateFare() {
        System.out.println("Calculating general transport fare...");
    }
}

// CC 1
class Bus extends Transport {
    @Override
    void calculateFare() {
        System.out.println("Bus Fare: ₹10 per km");
    }
}

// CC 2
class Train extends Transport {
    @Override
    void calculateFare() {
        System.out.println("Train Fare: ₹5 per km");
    }
}

// CC 3
class Taxi extends Transport {
    @Override
    void calculateFare() {
        System.out.println("Taxi Fare: ₹20 per km");
    }
}



public class TranspotationFare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Transport t;

	        t = new Bus();
	        t.calculateFare();

	        t = new Train();
	        t.calculateFare();

	        t = new Taxi();
	        t.calculateFare();

	}

}
