package week3.day2;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicatesUsingSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stubs
		
		//Use the declared String text as input
		String text="We learn java basics as part of java sessions in java week1";
		
//		Split the String into array and iterate over it 
//		String[] spte = text.split(" ");
//		for (String word : spte) {
//			System.out.print(" ");
//			
//			System.out.print(word);
//		}
		
//		 Initialize the TreeSet with character data type
//		 Set concept rejects duplicates and TreeSet uses ASCII index in ascending order
        Set<Character> data=new TreeSet<Character>();
        
//         Initialize the loop iteration from 0 to length of the text
        for (int i = 0; i < text.length(); i++) {
//			add the input to set
        	data.add(text.charAt(i));
		}
//        Iterate with for loop to get the expected output
        for (Character string : data) {
//        	g) Displaying the String without duplicate words
			System.out.print(string.toString());
		}
		
//        it removes not the duplicate word it totally removes the duplicate characters(alphabets, numbers)
//        Hence the code is solved on set
	}

}
