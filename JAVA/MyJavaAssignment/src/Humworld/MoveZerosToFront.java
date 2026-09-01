package Humworld;

public class MoveZerosToFront {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr =  {1, 0, 5, 6, 0, 1, 0, 0};
		
		int j = arr.length - 1;
		for(int i = arr.length -1; i >= 0; i--) {
			if(arr[i] != 0) {
				arr[j] = arr[i];
				j--;
			}
			
		}
		while(j >= 0) {
			arr[j]=0;
			j--;
		}

		
		
		
		for(int num : arr) { 
			System.out.print(num + " ");
		}
	}

}
