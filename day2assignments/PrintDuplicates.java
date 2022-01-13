package week3.day2assignments;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class PrintDuplicates {
	public static void main(String[] args) {
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20,12};
		Set<Integer> number = new LinkedHashSet<Integer>();
		Arrays.sort(arr);
		for (int i = 0; i < arr.length-1; i++) {
			if(arr[i]==arr[i+1]) {
				System.out.println(arr[i]);
		}
		
	
		}
	}
}


