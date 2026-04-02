package ArrayListAssignment;
import java.util.*;
public class SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>(
	            Arrays.asList(10, 20, 5, 30, 25)
	        );

	        int largest = Integer.MIN_VALUE;
	        int secondLargest = Integer.MIN_VALUE;

	        for (int num : list) {

	            if (num > largest) {
	                secondLargest = largest;
	                largest = num;
	            }
	            else if (num > secondLargest && num != largest) {
	                secondLargest = num;
	            }
	        }

	        System.out.println("Second Largest: " + secondLargest);

	}

}
