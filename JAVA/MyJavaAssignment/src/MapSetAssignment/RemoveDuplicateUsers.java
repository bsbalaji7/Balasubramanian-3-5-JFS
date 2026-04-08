package MapSetAssignment;
import java.util.*;
public class RemoveDuplicateUsers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> emails = Arrays.asList("user1@gmail.com",
	            "user2@gmail.com",
	            "user1@gmail.com",
	            "user3@gmail.com",
	            "user2@gmail.com"
	        );
		Set<String> uniqueMails = new HashSet<>(emails);
		List<String> result = new ArrayList<>(uniqueMails);
		
		System.out.println(result);
	}

}
