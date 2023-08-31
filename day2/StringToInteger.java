package week4.day2;


public class StringToInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String value = "(14523)";
        value = value.replaceAll("[^\\d-.]", "");
        int parseInt = Integer.parseInt(value);
        System.out.println(parseInt);
	}

}
