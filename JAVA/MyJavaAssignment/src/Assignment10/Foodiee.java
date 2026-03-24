package Assignment10;


abstract class Food{
	abstract void prepare();
}

class Burger extends Food{
	void prepare() {
		System.out.println("Burger is ready");
	}
}


class Pizza extends Food{
	void prepare() {
		System.out.println("Pizzza is ready");
	}
}
public class Foodiee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Food f;
		f = new Pizza();
		f.prepare();
		
		f = new Burger();
		f.prepare();
	}

}
