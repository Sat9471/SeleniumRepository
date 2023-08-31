package week4.day1;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String companyName="Testleaf";
		
        //t,e
		char[] ch = companyName.toCharArray();
		
		//set syntax
		Set<Character> unique=new LinkedHashSet<Character>();
		
		//for each loop
		  for (Character character : ch) {
			unique.add(character);
		}
		  System.out.println(unique);
	}

}
