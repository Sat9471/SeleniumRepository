package week3.day2;

public class AddTwoString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String num1 = "14569";
        String num2 = "174";
        System.out.println(num1+num2);//1469174
        
//        The method parseInt() belongs to the Integer class which is under java. lang package.
//        It is used to parse the string value as a signed decimal value.
//        It is used in Java for converting a string value to an integer by using the method parseInt().
        int number1 = Integer.parseInt(num1);
        int number2 = Integer.parseInt(num2);
        System.out.println(number1+number2);//14743  -->(14569+174=14743)
 
	}

}
