package week3.day2;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Here is the input
		int[] arr = { 1, 3, 4, 5, 6, 8, 10, 12 };
		// index      0  1  2  3  4  5   6   7

		int count = 1;
//        count=2
		
		// iteration value
		System.out.print("Missing element in an array: {");
		for (int i = 0; i <arr.length; i++) {
			if (arr[i] != i + count) {
//				a[0]!=0+1
//				1==1
//				a[4]!=4+1
//				4!=5
//				if the right hand side and left hand side are equals, then if condition fails, it will not execute after this and nothing will be printed
// 4==4 and 5==5 this will not be executed because it fails to full fill the condition
//				increase the value one by one after if condition
				// here it will print 1!=2, 5!=7, 6!=10, 7!=13
				//it will print out the missing number
				System.out.print((i + count) + ",");
				//1+1=2
				//6+1=7
				//8+1=9
				//11+1
				
				count++;	
//				count 2 increased after the first output  -->2
//				count 2 increased after the second output -->7
			}
		}
		System.out.print("}");
	}

}
