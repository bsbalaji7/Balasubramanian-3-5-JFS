package MapSetAssignment;
import java.util.*;
public class FindMissingNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 10;
        int[] arr = {1, 2, 4, 6, 7, 9};

        // Store array elements in a Set
        Set<Integer> set = new HashSet<>();
        for(int num : arr) {
            set.add(num);
        }

        // Find missing numbers
        List<Integer> missing = new ArrayList<>();
        for(int i = 1; i <= N; i++) {
            if(!set.contains(i)) {
                missing.add(i);
            }
        }

        System.out.println("Missing Numbers: " + missing);
	}

}
