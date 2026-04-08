package MapSetAssignment;
import java.util.*;
public class CharacterFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "aabbc";

        Map<Character, Integer> map = new HashMap<>();

        for(char ch : str.toCharArray()) {
            // If character already exists, increase count
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        System.out.println(map);
	}

}
