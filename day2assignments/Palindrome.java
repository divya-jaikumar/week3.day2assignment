package week3.day2assignments;

public class Palindrome {
	//Build a logic to find the given string is palindrome or not
    
		/*
		 * Pseudo Code
		
		 * a) Declare A String value as"madam"
		 
		 * b) Declare another String rev value as ""
		 * c) Iterate over the String in reverse order
		 * d) Add the char into rev
		 * e) Compare the original String with the reversed String, if it is same then print palinDrome 
		 
		 * Hint: Use .equals or .equalsIgnoreCase when you compare a String 
		 */

	public static void main(String[] args) {
		String val="madam";
		String rev="";
		int len=val.length();
		for(int i=len-1;i>=0;i--) {
			rev=rev+val.charAt(i);
			
		}
		if(val.equals(rev)) {
			System.out.println("The given string is a palindrome");
		}
		else {
			System.out.println("It is not a palindrome");
		}
		
		

	}

}
