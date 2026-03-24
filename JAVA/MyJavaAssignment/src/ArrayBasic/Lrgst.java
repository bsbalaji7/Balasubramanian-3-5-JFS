package ArrayBasic;

public class Lrgst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {10, 45, 23, 67, 34};

        int max = numbers[0];

        for(int i = 1; i < numbers.length; i++) {
            if(numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println("Largest element = " + max);
	}

}
