package week3.day2assignments;

import java.util.List;
import java.util.Arrays;
import java.util.Collections;


public class FindSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] data = {3,2,11,4,6,7};
		
		List<Integer> nums=Arrays.asList(data);
		Collections.sort(nums);
		//Arrays.sort(data);
		int secnum=nums.get(data.length-2);
		System.out.println(secnum);
	}

}
