package week3.day2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FindIntersectionUsingList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//      a) Declare An array for {3,2,11,4,6,7};	 
//		int array1[]={3,2,11,4,6,7};	--> in array 
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(3);
		list1.add(2);
		list1.add(11);
		list1.add(4);
		list1.add(6);
		list1.add(7);

//		b) Declare another array for {1,2,8,4,9,7};
//		int array2[]={1,2,8,4,9,7};     --> in arrary
		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(1);
		list2.add(2);
		list2.add(8);
		list2.add(4);
		list2.add(9);
		list2.add(7);

//		boolean intersection = true;
		List<Integer> list3=new ArrayList<Integer>();
// c) Declare for loop iterator from 0 to array length
//		for (int i = 0; i < list1.size(); i++)
		for (int i = 0; i <= list1.size()-1; i++){
			int value1 = list1.get(i);

// d) Declare a nested for another array from 0 to array length
//			for (int j = 0; j < list2.size(); j++)
			for (int j = 0; j <= list2.size()-1; j++) {
				int value2 = list2.get(j);
				
// e) Compare Both the arrays using a condition statement
				if (value1 == value2) {
					System.out.println(value2);
					list3.add(value2);
//					if (intersection) {
// f) Print the first array (should match item in both arrays)						
//						System.out.print("Intersected values in the list: " + value1);
//						intersection = false;
//					} else {
//						System.out.print(", " + value1);
//					}
				}
			}
			System.out.println("The intersection value are : "+list3);
		}
	}
}
