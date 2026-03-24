package ArrayBasic;

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {10, 20, 30, 40, 50};

        int sum = 0;

        for(int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }

        System.out.println("Sum of elements = " + sum);
	}

}
