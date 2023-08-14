package week1.day2;

public class Mark {

	public static void main(String[] args) {
		int mark=75;
		if(mark==35) {
			System.out.println("Grade E");
		}
		else if(mark>=50) {
			System.out.println("Grade D");
		}
		else if(mark>65) {
			System.out.println("Grade C");
		}
		else if(mark>=75) {
			System.out.println("Grade B");
		}
		else{
			System.out.println("Grade A");
		}

	}

}
