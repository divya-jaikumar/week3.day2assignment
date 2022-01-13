package week3.day2assignments;

public class ReverseEvenWords {
public static void main(String[] args) {
	String test = "I am a software tester";
	String[] charArray = test.split(" ");
	for(int i = 0; i<charArray.length ; i++) {
		String word = charArray[i];
		int l = charArray[i].length();
		if(((i+1)%2)==0 ) {
			for(int j = (l-1);j>=0;j--) {
			  System.out.print(charArray[i].charAt(j));//reversing eachChar of the taken word
			}
			}else {
				System.out.print(word);
			
		}
		System.out.print(" ");
	}
	
	
}
}		

//String even="I am a Software tester";
//String arr[]=even.split(" ");
//for (int i = 0; i < arr.length; i++) {
//    if(i%2==0) {
//        System.out.print(arr[i]);
//        System.out.print(" ");
//    }
//    else {//[ am  Software ]
//        char reverse[]=arr[i].toCharArray();
//        for(int j=(reverse.length)-1;j>=0;j-- ) {//str.len-1 2  >0 1 0
//            System.out.print(reverse[j]);
//    }
//        System.out.print(" ");
//}
