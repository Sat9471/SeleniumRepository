package week3.day2;

import java.util.Iterator;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		a) Declare An array for {3,2,11,4,6,7};
		int array1[]={3,2,11,4,6,7};
		
//		b) Declare another array for {1,2,8,4,9,7};	
		int array2[]={1,2,8,4,9,7};	
		
		System.out.print("Instersection of the two arrays : ");
//		Declare for loop iterator from 0 to array length
		for (int i = 0; i < array1.length; i++) {
			
//			d) Declare a nested for another array from 0 to array length
			for (int j = 0; j < array2.length; j++) {
				
//			e) Compare Both the arrays using a condition statement
			if (array1[i]==array2[j]) {
			
//				We are removing ln in syso statement to print in the same line
//				and giving space " " to seperate the numbers in the array
				
				System.out.print(array1[i]+" ");
			}
			
		}
	}

}
}