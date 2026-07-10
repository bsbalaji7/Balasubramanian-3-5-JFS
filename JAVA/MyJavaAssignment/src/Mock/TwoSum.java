package Mock;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[] = {1,3,4,5,8,9};
		int Target = 7;
		
		for(int i = 0; i < num.length; i++) {
			for(int j = i + 1; j < num.length;j++) {
				if(num[i] + num[j] == Target) {
					System.out.println(i +" "+ j);
					break;
				}
			}
		}
	}

}
