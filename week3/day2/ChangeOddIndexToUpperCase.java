package week3.day2;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String object
//Declare String Input as Follow
//String test = "changeme";
		
		String test=new String("changeme");
		
//		Convert the String to character array
//		test.toCharArray()
//		ctrl+2 then assign to local variable
		char[] charArray = test.toCharArray();
		
//		Traverse through each character (using loop)	
         for (int i = 0; i < charArray.length; i++) {
//        	 c)find the odd index within the loop (use mod operator)
//        	 modules operator %
        	 if(i%2==0) {
//        		  d)within the loop, change the character to uppercase, if the index is odd else don't change
        		 char upperCase = Character.toUpperCase(charArray[i]);
        		 System.out.print(upperCase);
        	 }else {
        		 System.out.print(charArray[i]);
        	 }
		}
	}

}
