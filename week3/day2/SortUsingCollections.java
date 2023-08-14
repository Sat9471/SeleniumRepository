package week3.day2;

import java.util.Arrays;

public class SortUsingCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Declare a String array and add the Strings values as (HCL, Wipro, Aspire
		// Systems, CTS)
		String[] input = new String[] { "HCL", "Wipro", "Aspire Systems", "CTS" };

		// get the length of the array
		int length = input.length;
		System.out.println("Number of information technology companies: " + length);

		// sort the array
		Arrays.sort(input);

        // Declare a StringBuilder object
        StringBuilder sb= new StringBuilder();
        
        // System.out.print("{");
        //append the opening curly brace
        sb.append("{");
		
		// Iterate it in the reverse order
		for (int i = input.length - 1; i >= 0; i--) {
			//trim the array elements
            // This means that if the input array has any spaces, they will be removed
            // input[i]=input[i].trim(); 
			
			// print the array
			//System.out.print(input[i] + ", ");
			sb.append(input[i]+", ");
		}
		
		//remove the last comma
		sb.deleteCharAt(sb.length()-2);
		
        // System.out.print("}");
        // Append the closing curly brace
		sb.append("}");
		
		//print the array
		//Required Output: Wipro, HCL , CTS, Aspire System
		System.out.println(sb.toString());
	}

}
