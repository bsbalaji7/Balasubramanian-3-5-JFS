package ArrayBasic;

public class Avg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] numbers = {10, 20, 30, 40, 50};

	        int sum = 0;

	        for(int i = 0; i < numbers.length; i++) {
	            sum = sum + numbers[i];
	        }

	        double average = sum / numbers.length;

	        System.out.println("Average = " + average);
	}

}
