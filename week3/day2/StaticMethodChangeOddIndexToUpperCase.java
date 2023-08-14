package week3.day2;

public class StaticMethodChangeOddIndexToUpperCase {

		    public static String changeOddIndex(String input) {
		        // Changeme,  cHaNgEmE
		        String output="";
		        String lowerCase = input.toLowerCase();
//		        char[] charArray = lowerCase.toCharArray();
		        String[] split = lowerCase.split("");
		        for (int i = 0; i < split.length; i++) {
		            if(i%2!=0) {
		                output = output+(split[i].toUpperCase());
		            }else {
		                output = output+(split[i]);
		            }
		        }
		        return output;
		    }
		     
		    
		public static void main(String[] args) {
	        System.out.println(changeOddIndex("Changeme"));
	        System.out.println(changeOddIndex("facebook"));
	    }
	}


