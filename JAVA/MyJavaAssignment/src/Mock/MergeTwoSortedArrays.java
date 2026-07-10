package Mock;

import java.util.Arrays;
import java.util.*;

public class MergeTwoSortedArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {2,3,4,5,10};
		int b[] = {6,7,8,9,11};
		
		int[] result = new int[a.length + b.length];
		int k = 0;
		
		for(int i = 0; i < a.length;i++) {
			result[k++] = a[i] ;
		}
		
		for(int i = 0; i < b.length;i++) {
			result[k++] = b[i] ;
		}
		
		Arrays.sort(result);
		
		System.out.println(Arrays.toString(result));
	}
}
