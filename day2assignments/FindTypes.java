package week3.day2assignments;

public class FindTypes {
	// Build the logic to find the count of each
			/* Pseudo Code:
				a) Convert the String to character array
				b) Traverse through each character (using loop)
				c) Find if the given character is what type using (if)
						i)  Character.isLetter
						ii) Character.isDigit
						iii)Character.isSpaceChar
						iv) else -> consider as special character
			*/

	public static void main(String[] args) {
		String test = "$$ Welcome to 2nd Class of Automation $$ ";
		int  letter = 0, space = 0, num = 0, specialChar = 0;
		char[] testchar=test.toCharArray();
		for(int i=0;i<=test.length()-1;i++) {
			if(Character.isLetter(test.charAt(i))){
				letter++;
			}
			
			else if(Character.isDigit(test.charAt(i))) {
				num++;
				
			}
			else if(Character.isSpaceChar(test.charAt(i))) {
				space++;
			}
			else {
				specialChar++;
			}
		}
		System.out.println("letter: " + letter);
		System.out.println("space: " + space);
		System.out.println("number: " + num);
		System.out.println("specialCharcter: " + specialChar);
	}

}
