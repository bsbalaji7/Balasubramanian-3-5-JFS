package Prac1;

public class FizzBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i = 1; i<=20; i++) {
			if(i%3==0 && i%5==0) {
				System.out.println("FizzBuzz");
			}else if(i%3==0) {
				System.out.println("Fizz");
			}else if(i%5==0) {
				System.out.println("Bizz");
			}else {
				System.out.println(i);
			}
		}
	}

}
