package week4.day1;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.checkerframework.checker.units.qual.C;

public class PrintUniqueCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		 * a) Take your name as input
       String name="Sathish";
//       converting string to char
       char[] chary = name.toCharArray();
       
//     using HashSet concept to remove duplicates
       Set<Character> charSet=new HashSet<Character>();
       
//     c) Add each character to the Set and if it is already there, remove it
//     using for loop iterataion
       for (int i = 0; i < chary.length; i++) {
//    	converting set to list
		charSet.add(chary[i]);
		/*chary[0]=S;
		chary[1]=a;
		chary[4]=i;
		*/
	}
//       System.out.println(charSet);
       
//       now store it in list order to compare and get the unique characters
     List<Character> charList=new LinkedList<Character>(charSet);
//     now compare the charList with array chary[i] and when it was not more than one time print it
//       charList[0]= a;
//       charList[1]= S;       
//       charList[2]= s;
//       charList[3]= t;       
//       charList[4]= h;
//       charList[5]= i;
     
     StringBuilder sb=new StringBuilder();
     sb.append("{");
     for (int i = 0; i < charList.size(); i++) {
//    	intializing temporary variable to count the occurrence
		int count=0;
		
//      chary[0]= S;
//      chary[1]= a;       
//      chary[2]= t;
//      chary[3]= h;       
//      chary[4]= i;
//      chary[5]= s;
//      chary[6]= h;
		for (int j = 0; j < chary.length; j++) {
			if(charList.get(i)==chary[j]){
				count++;
			}
		}
		if (count==1) {
			sb.append(charList.get(i)).append(",");
//			d) Finally, print the set	
//		System.out.println(charList.get(i));
	  }         
	 }
//     remove the last comma
     sb.deleteCharAt(sb.length()-1);
     sb.append("}");
     
     System.out.println(sb.toString());
	}
}
