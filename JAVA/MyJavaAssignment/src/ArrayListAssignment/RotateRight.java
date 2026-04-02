package ArrayListAssignment;
import java.util.*;
public class RotateRight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>(
	            Arrays.asList(1, 2, 3, 4, 5)
	        );

	        int k = 3;

	        for (int i = 0; i < k; i++) {
	            int last = list.remove(list.size() - 1); // remove last
	            list.add(0, last); // add at beginning
	        }

	        System.out.println(list);
	}

}
