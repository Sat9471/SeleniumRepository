package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindSecondLargestUsingList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] data = {3,2,11,4,6,7};
		
//		add the array to list
		List<Integer> list= new ArrayList<Integer>();
		
		for (int i = 0; i < data.length; i++) {
			//this will iterate and add the value in the list
			list.add(data[i]);
		}
//		this will print the data in the order given
		 System.out.println(list);
		 
//	Once we arranged them in ascending order
//  then the largest value will be at the last position of the list, last position will be identified by getting size-1 value
//	     in order to find second largest we need to get by the size
	  Collections.sort(list);
	  System.out.println(list);
	
//       now arranged, find second largest
	     int size = list.size();
//	     this will get the value in the size-2
		 System.out.println("Second largest value in the list: "+list.get(size-2));
	}

}
