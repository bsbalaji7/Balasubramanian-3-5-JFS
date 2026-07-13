package Prac1;

class Animal {
	void sound(){
		System.out.println("sound of animal");
	}

}

class Dog extends Animal{
	void bark(){
		System.out.println("boww boww");
	}
}


public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d = new Dog();
		d.bark();
		d.sound();
	}

}
