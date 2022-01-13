package week3.day2assignments;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class FindIntersection {
	/*
	 * Pseudo Code
	
	 * a) Declare An array for {3,2,11,4,6,7};	 
	 * b) Declare another array for {1,2,8,4,9,7};
	 * c) Declare for loop iterator from 0 to array length
	 * d) Declare a nested for another array from 0 to array length
	 * e) Compare Both the arrays using a condition statement
	 
	 *  f) Print the first array (shoud match item in both arrays)
	 */
	

	public static void main(String[] args) 
	  {
	    Integer[] firstArray = {3,2,11,4,6,7};
	    Integer[] secondArray = {1,2,8,4,9,7};
	     
	    HashSet<Integer> set = new HashSet<Integer>(); 
	     
	    set.addAll(Arrays.asList(firstArray));
	     
	    set.retainAll(Arrays.asList(secondArray));
	     
	    System.out.println(set);
	     
	    //convert to array
	    Integer[] intersection = {};
	    intersection = set.toArray(intersection);
	     
	    System.out.println(Arrays.toString(intersection));
	  }}
