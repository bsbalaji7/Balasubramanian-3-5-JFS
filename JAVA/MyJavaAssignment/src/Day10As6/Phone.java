package Day10As6;

public class Phone {
	    String model;
	    int price;

	    // Default constructor
	    Phone() {
	        model = "Samsung";
	        price = 20000;
	    }

	    void display() {
	        System.out.println("Model: " + model);
	        System.out.println("Price: " + price);
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone p1 = new Phone(); // object creation
        p1.display();           // display values
	}

}
