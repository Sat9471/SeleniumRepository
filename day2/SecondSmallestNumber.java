package week1.day2;

import java.util.Arrays;

public class SecondSmallestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] num= {23,45,67,32,89,22};
		int length = num.length;
		System.out.println("Number in the series: "+num.length);
	
		Arrays.sort(num);
		
		System.out.print("Sorted number in the series: {");
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i]);
			if(i!=num.length-1) {
			   System.out.print(", ");
			}   
		}
		System.out.println("}");
		
		System.out.println("Second number in the array: "+num[1]);
		
	}
}
	

