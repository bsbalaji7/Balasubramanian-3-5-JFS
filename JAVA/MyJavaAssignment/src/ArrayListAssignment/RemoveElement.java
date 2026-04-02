package ArrayListAssignment;
import java.util.*;
public class RemoveElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> List = new ArrayList<>(
				Arrays.asList(1,2,3,4,4,3,2,5));
		
		int element = 2;
		List.removeIf(n -> n == element);
		System.out.println(List);
	}

}
