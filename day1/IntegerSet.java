package week4.day1;

import java.util.Set;
import java.util.TreeSet;

public class IntegerSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] num= {2,4,6,7,8,2,5,3,2};
		Set<Integer> data=new TreeSet<Integer>();

				for (Integer i : num) {
					data.add(i);
				}
				System.out.println(data);
	}

}
