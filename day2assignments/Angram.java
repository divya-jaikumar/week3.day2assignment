package week3.day2assignments;

import java.util.Arrays;

public class Angram {
	public static void main(String[] args) {
	 //Pseudo Code
	  
	 //Declare a String 
		String text1 = "stops";
	 //Declare another String
		String text2 = "potss"; 
		int len1=text1.length();
		int len2=text2.length();
		

		
		//b) Convert both Strings in to characters
			char[] charArray1 = text1.toCharArray();
			char[] charArray2 = text2.toCharArray();
		//c) Sort Both the arrays
			Arrays.sort(charArray1);
			Arrays.sort(charArray2);
		
		//d) Check both the arrays has same value
			if(len1==len2) {
			if(Arrays.equals(charArray1,charArray2)) {
				System.out.println("Its a anagram");
			}
			else {
				System.out.println("not an anagram");
			}
			
		}
			else {
				System.out.println("Its not of equal length");
			}
	}

}
