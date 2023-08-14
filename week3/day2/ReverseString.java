package week3.day2;

import java.util.Iterator;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input="Testleaf";
		char[] ca = input.toCharArray();
		
		int length = input.length();
		System.out.println("Number of characters in the word: "+input.length());
		
		for (int i =input.length()-1; i>=0; i--) {
			System.out.print(ca[i]);
		}

	}

}
