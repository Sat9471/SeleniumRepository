
package week1.day2;

import java.util.Iterator;

public class FibonacciSeries {

	    public static void main(String[] args) {
	        // TODO Auto-generated method stub
	        
	        // 0,1, 1, 2,3,5,8
	        // 0,1 =1
	        // 1, 1 =2
	        //1,2= 3
	        //2, 3 = 5
	        // 3, 5 =8
	        int range =8;
	        int firstNum = 0;
	        int secondNum = 1;
	        int thirdNum ;
	        System.out.print("The fibinacci series are : {");
	        for(int i=0;i <range; i++) {
	            System.out.print(firstNum);
	            if(i!=range-1) {
	            	System.out.print(", ");
	            }
	            thirdNum = firstNum + secondNum;
	            firstNum = secondNum;
	            secondNum = thirdNum;
	            
	        }
	        System.out.println("}");
	        
	    }
	}
