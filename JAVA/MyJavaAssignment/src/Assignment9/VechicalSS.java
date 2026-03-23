package Assignment9;

interface Vehicle {
    void startEngine();
    void stopEngine();
}

class Car implements Vehicle {
    public void startEngine() {
        System.out.println("Car engine started using key ignition.");
    }

    public void stopEngine() {
        System.out.println("Car engine stopped.");
    }
}

class Bike implements Vehicle {
    public void startEngine() {
        System.out.println("Bike engine started using self-start or kick.");
    }

    public void stopEngine() {
        System.out.println("Bike engine stopped.");
    }
}

class Truck implements Vehicle {
    public void startEngine() {
        System.out.println("Truck engine started with heavy-duty ignition.");
    }

    public void stopEngine() {
        System.out.println("Truck engine stopped.");
    }
}

public class VechicalSS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle v;

        v = new Car();
        v.startEngine();
        v.stopEngine();

        System.out.println();

        v = new Bike();
        v.startEngine();
        v.stopEngine();

        System.out.println();

        v = new Truck();
        v.startEngine();
        v.stopEngine();
	}

}
