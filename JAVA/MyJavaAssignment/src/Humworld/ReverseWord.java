package Humworld;

public class ReverseWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String str = "hello java";
        String word[] = str.split(" ");
        
        for(int i = 0; i < word.length; i++) {
        	for(int j = word[i].length() - 1; j>=0;j--) {
        		System.out.print(word[i].charAt(j));
        	}
        	System.out.print(" ");
        }
	}

}
