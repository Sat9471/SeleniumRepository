package week3.day1;

public class Calculator {

	public int add(int a, int b) {
     	return a+b;
	}
	
	public int add(int a, int b, int c)
	{ return a+b+c;
	}

	public double multiply(double a, double b) {
		return a*b;
	}
	
	public float multiply(float a, float b) {
		return a*b;
	}
	
	public static void main() {
		Calculator cal=new Calculator();
		System.out.println("Adding two integer: "+ cal.add(10, 15));
		System.out.println("Adding three integer: "+ cal.add(20, 30, 50));
		System.out.println("Multiplying two double value: "+ cal.multiply(17.1777745689, 10.17777745689));
		System.out.println("Multiplying two float value: "+ cal.multiply(4.3333, 3.3333));
	}
}
