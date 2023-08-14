package week1.day2;

public class NegativeNumberToPositiveNumber {

	public static void main(String[] args) {
		int number=-40;
		if (number<0) {System.out.println(number+" is negative number ");
		}
		if (number>0) {System.out.println(number+" is positive number ");
			
		}
		int reverseNumber=-(number);
		
		System.out.println("The number "+number+" is converted to "+reverseNumber);
		
		
	}

}
