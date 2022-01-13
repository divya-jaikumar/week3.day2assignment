package week3.day2assignments;

public class CharOccurance {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		char find='o' ;
		// Check number of occurrences of a char (eg 'e') in a String
		
					String str = "welcome to chennai";

					// declare and initialize a variable count to store the number of occurrences
					
					
					// convert the string into char array
					char[] characterarr= str.toCharArray();
						
					//get the length of the array
					int len=characterarr.length;
						System.out.println(len);
					// traverse from 0 till the array length 
					for(int i=0;i<=len-1;i++) {
						// Check the char array has the particular char in it 
						if(str.charAt(i)==find){
							count++;
						}
					}
					System.out.println(count);
						
					
						// if is has increment the count
							 
						
						// print the count out of the loop
						
	}

	

}
