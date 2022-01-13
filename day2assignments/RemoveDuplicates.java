package week3.day2assignments;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {
public static void main(String[] args) {
//	String text = "We learn java basics as part of java sessions in java week1 We";
//	String[] strArray = text.split(" ");
//	//Converting Character  to set as charset
//			Set<String> str1 = new LinkedHashSet<String>();
//			//Converting Character  to set as charset
//			Set<String> str2 = new LinkedHashSet<String>();
//			for (String str : strArray) {
//				boolean add = str1.add(str); //adding to a set returns a Boolean Value
//				if(!add) {
//					str2.add(str);
//				}
//			}
//			System.out.println("Duplicates : " +str2);
//			str1.removeAll(str2); // Removing the duplicate from the sentence
//			System.out.println("The resulting sentence is : " +str1);
////}
//}
//
//String Sent = "We learn java basics as part of java sessions in java week1";
//int count;
//String[] split=Sent.split(" ");
////System.out.println(split);
//
//Set<String>sentence=new LinkedHashSet<String>();
//
//for (String stringsentence : split) {
//    sentence.add(stringsentence);
//    
//}
//System.out.println(sentence);
////List<String>Stringsent=new ArrayList<String>(Arrays.asList(sentence));
//List<String>Stringsent=new ArrayList<String>(sentence);
//String string = Stringsent.toString();
//String replace = string.replace("", " ");
//System.out.println(replace);
//}
//
//
//}

//from Mohan (TestLeaf) to everyone:    8:39 PM
String name="We learn java basics as part of java sessions in java week1";
int count=0;
String[]str=name.split(" ");
Set<String>duplname=new LinkedHashSet<String>();
for (String remove :str ) {
duplname.add(remove);
if(count>1) {
    System.out.println();
}    
}

System.out.println(duplname);
}
}
