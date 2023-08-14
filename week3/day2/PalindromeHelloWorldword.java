package week3.day2;

public class PalindromeHelloWorldword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	 String input="Hello world";
   	 String output="";
   	 String[] split=input.split("");
   	 
   	 for (int i = split.length-1; i>=0; i--) {
   		 //output-->, split[1]-->world, output--.world
   		 //output-->world, split[0]-->Hello, output-->world Hello
   		 if(i==0) {
   			 output=output+split[i];
   		 }else {
   		 output=output+(split[i])+" ";
	}

}
}}