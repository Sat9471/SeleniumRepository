package week3.day2;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class PrintUniqueCharactersUsingList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input="Sathish";
		
		// a) Convert String to Character array
        char[] cha = input.toCharArray();
		
        //b) Create a new Set -> HashSet
        //Set collections concept avoids duplicate
     Set<Character> set=new HashSet<Character>();
        
//     c) Add each character to the Set and if it is already there, remove it
      for (int i = 0; i < cha.length; i++) {
		set.add(cha[i]);
//		set.add(cha[1])=s;
//      set.add(cha[2])=a;
//		set.add(cha[5])=h;
//      set.add(cha[6])=i;
    	  
	}
//     now store it in list in order to compare and get unique order 
//      System.out.println(set);
      
//      now compare the list with the array ch and when it was not more than one print it
      List<Character> list=new LinkedList<Character>(set);

      for (int i = 0; i < list.size(); i++) {
	     //initialize one variable to count the occurance
    	  int c =0;
    	 for (int j = 0; j < cha.length; j++) {
			if (list.get(i)==cha[j]) {
				c++;
			}
		} 
    	 if(c==1) {
//    		 d) Finally, print the set
    		 System.out.println(list.get(i));
    	 }
	}
}

}
