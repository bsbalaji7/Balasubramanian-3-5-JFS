package Assignment10;

abstract class Appliance {
    abstract void turnOn();
    abstract void turnOff();
}

class Fan extends Appliance{
	void turnOn() {
        System.out.println("Fan is turned ON.");
    }

    void turnOff() {
        System.out.println("Fan is turned OFF.");
    }
}

class WashingMachine extends Appliance {
    void turnOn() {
        System.out.println("Washing Machine is started.");
    }

    void turnOff() {
        System.out.println("Washing Machine is stopped.");
    }
}



public class Electronics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Appliance a;

        a = new Fan();
        a.turnOn();
        a.turnOff();

        System.out.println();

        a = new WashingMachine();
        a.turnOn();
        a.turnOff();
	}

}
