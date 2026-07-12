package Prac1;

public class DuplicateValueRemove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,1,1,3,4,2,4,5,6,7,7,8};
		
		for(int i = 0; i < arr.length;i++) {
			boolean IsDupi = false;
			for(int j = i+1; j<arr.length; j++) {
				
				if(arr[j] == arr[i]) {
				IsDupi = true;
				break;
			}
			
		}
			if(!IsDupi){
				System.out.print(arr[i] + " ");
			}
			
		}
	}
}


