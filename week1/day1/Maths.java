package week1.day1;

public class Maths {
	public void name() {
		System.out.println("Maths");
	}
	
	public int add(int a, int b) {
		return a+b;
	}
    public int sub(int a, int b) {
    	return a-b;
    }
    private int multiply(int a, int b) {
		return a*b;
	}
    
    double divide(double a, double b) {
    	return a/b;
    }
    
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	     Maths  m= new Maths();
	     m.name();
	     System.out.println("Addition"+" "+m.add(20, 15));
	     int sub = m.sub(20, 15);
	     System.out.println("Subraction "+sub);
	     int multiply = m.multiply(20, 15);
	     System.out.println("Multiplication "+ multiply);
	     System.out.println("Division "+m.divide(20, 15));
	     }

}
