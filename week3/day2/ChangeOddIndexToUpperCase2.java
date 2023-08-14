package week3.day2;

public class ChangeOddIndexToUpperCase2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input="changeme";
		char[] charArray = input.toCharArray();
		
		//split the input
		String[] split = input.split("");
		for (int i = 0; i < split.length; i++) {
			if (i%2!=0) {
				System.out.print(split[i].toUpperCase());
			}else {
				System.out.print(split[i]);
			}
			
			
		}

	}
//	public static void main(String[] args) {
//		System.out.println(changeOddIndex("changeme"));
//	}

}
