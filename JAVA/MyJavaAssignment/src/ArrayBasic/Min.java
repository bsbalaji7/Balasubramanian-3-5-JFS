package ArrayBasic;

public class Min {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {10, 45, 23, 67, 34};

        int min = numbers[0];

        for(int i = 1; i < numbers.length; i++) {
            if(numbers[i] < min) {
                min = numbers[i];
            }
        }

        System.out.println("Small element = " + min);
	}

}
