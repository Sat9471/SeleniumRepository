package week3.day2;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input="HelloWorld";
		
		// need to store the input in another variable called temp
		String temp=input;
		
		// creating another variable output outside for loop to compare with input variable
		String output="";
		//input.toCharArrary();
		//ctrl+2 then L
		char[] charArray = input.toCharArray();
		// another method String[] split = input.split("");
		
		for (int i = charArray.length-1; i>=0; i--) {
			System.out.println(charArray[i]);
			
			//output-->, CharArray[9]--> d, output=d
			//output=d, charArray[8]--> l, output=dl
			//output=dl, charArray[7]--> r, output=dlr
			//output=dlr, charArray[6]--> o, output=dlro
			//output=dlro, charArray[5]--> o, output=dlrow
			output = output+charArray[i];
		}
		if (input.equalsIgnoreCase(output)) {
			System.out.println(output+" is a palindrome of "+input);
		}else {
			System.out.println(output+" is not a Palindrome of "+input);
		}

	}
   }
