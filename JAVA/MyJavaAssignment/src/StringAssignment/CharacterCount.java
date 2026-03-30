package StringAssignment;

public class CharacterCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "aaabbccccd";
        String result = "";

        int count = 1;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++; // same char → increase count
            } else {
                result += s.charAt(i - 1) + "" + count;
                count = 1; // reset count
            }
        }

        // last character
        result += s.charAt(s.length() - 1) + "" + count;

        System.out.println(result);
	}

}
