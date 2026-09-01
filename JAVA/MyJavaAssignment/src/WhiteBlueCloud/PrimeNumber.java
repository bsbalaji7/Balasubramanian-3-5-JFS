package WhiteBlueCloud;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		boolean prime = true;
		
		if(n <2) {
			prime = false;
		}
		
		for(int i = 2; i < n;i++) {
			if(n % i ==0) {
				prime = false;
				break;
			}
		}
		
		if(prime) {
			System.out.println("prime");
		}else {
			System.out.println("not a prime");

		}
		
	}

}
