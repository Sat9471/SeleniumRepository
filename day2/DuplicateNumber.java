package week1.day2;

import java.util.Arrays;
import java.util.Iterator;

public class DuplicateNumber {

	public static void main(String[] args) {
		int[] num= {2,5,7,7,5,9,2,3};
		 int length = num.length;
		 System.out.println("Total numbers: "+length);
         System.out.println("First number in the series: "+ num[0]);
         System.out.println("Last number in the series: "+ num[7]);
         
         Arrays.sort(num);
         System.out.println("Last number in the series after sorting: "+num[length-1]);
          		for (int i = 0; i <length; i++)
					System.out.println("Series in the ascending order: "+num[i]);
				
          		
          		for (int i = 0; i < num.length; i++) {
					for (int j = i+1; j < num.length; j++) {
						if(num[i]==num[j]) {
							System.out.println("Duplicate numbers: "+num[i]);
						
					}
				} 
	}
	}
}
