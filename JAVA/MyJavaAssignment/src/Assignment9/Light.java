package Assignment9;


interface SmartDevice {
    void turnOn();
    void turnOff();
}

class Fan implements SmartDevice {
    public void turnOn() {
        System.out.println("Fan is turned ON. Blades are rotating.");
    }

    public void turnOff() {
        System.out.println("Fan is turned OFF.");
    }
}

class Lightt implements SmartDevice {
    public void turnOn() {
        System.out.println("Light is turned ON. Room is illuminated.");
    }

    public void turnOff() {
        System.out.println("Light is turned OFF.");
    }
}

class AirConditioner implements SmartDevice {
    public void turnOn() {
        System.out.println("Air Conditioner is turned ON. Cooling started.");
    }

    public void turnOff() {
        System.out.println("Air Conditioner is turned OFF.");
    }
}


public class Light {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		SmartDevice device;

        device = new Fan();
        device.turnOn();
        device.turnOff();

        System.out.println();

        device = new Lightt();
        device.turnOn();
        device.turnOff();

        System.out.println();

        device = new AirConditioner();
        device.turnOn();
        device.turnOff();
        
        
	}

}
