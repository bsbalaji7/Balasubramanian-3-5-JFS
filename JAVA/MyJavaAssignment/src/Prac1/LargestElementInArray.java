package Prac1;

public class LargestElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {20,23,50,31,55,77,10};
		int largest = arr[0];
				
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] >= largest) {
				largest = arr[i];
			}
		}
		System.out.println(largest);
	}

}
 