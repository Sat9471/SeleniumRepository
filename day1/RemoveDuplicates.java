package week4.day1;

import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//	Declare a String as "PayPal India"
    String input="PayPal India";
		
//		Convert it into a character array
    char[] eachChar = input.toCharArray();
    
//    Declare a Set as charSet for Character
//    set will not allow duplicates
    Set<Character> charSet=new TreeSet<Character>();
    
//    Declare a Set as dupCharSet for duplicate Character
    Set<Character> dupCharSet=new TreeSet<Character>();
 
//	Iterate character array and add it into charSet
    for (int i = 0; i < eachChar.length; i++) {
    	//set will not allow duplicate
//    	The set add() function adds the element only if the specified element is not already present in the set
		if (!charSet.add(eachChar[i])) {
//			if the character is already in the charSet then, add it to the dupCharSet
			dupCharSet.add(eachChar[i]);
		}
	}
    
    System.out.println("charSet : "+charSet);
    System.out.println("dupCharSet : "+dupCharSet);
//    Check the dupCharSet elements and remove those in the charSet
    charSet.removeAll(dupCharSet);
    
//	Iterate using charSet
/*  need to iterate charset
    variable name character
    wrapper name Character
*/  for (Character character : charSet) {
//		Check the iterator variable isn't equals to an empty space
    	if(character!=' ') {
//    		print it
    		System.out.println(character);
    	}
		
	}
    
    
	}

}
