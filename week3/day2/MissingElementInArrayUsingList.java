package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElementInArrayUsingList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// Here is the input
	  int[] arr = { 1, 2, 3, 4, 7, 6, 8 };
      List<Integer> list = new ArrayList<Integer>();
      
//    a variable to store the expected value
      int expected=1;
      
      for (int i = 0; i < arr.length; i++) {
//    	list.add(1);
//    	list.add(2);
//    	it will print till the last index value 9
//    	list.add(8);
//      list.add(arr[i]); this will do like the above value
		list.add(arr[i]);
	}
      System.out.println("Array before sorting: "+list);
	
      Collections.sort(list);
	   System.out.println("Array after sorting: "+list);
	   
	   for (int i = 0; i < list.size(); i++) {
		if (list.get(i)!=expected) {
        System.out.println("The missing element is: "+expected);
        break;
		}
		//increment the expected value by one
		expected++;
	} 
 }   
}

