package week1.day2;

import java.util.Arrays;

public class Intersection {

	public static void main(String[] args) {
		
		int[] seriesA= {3,2,11,4,6,7};
		int length = seriesA.length;
		Arrays.sort(seriesA);
		System.out.println("Series A size:"+length);
		
		int[] seriesB= {1,2,8,4,9,7};
		int length2 = seriesB.length;
		Arrays.sort(seriesB);
		System.out.println("Series B size:"+length2);
		
		for (int i = 0; i < seriesA.length; i++) {
		
		for (int j = 0; j < seriesB.length; j++) {
			
		if (seriesA[i]==seriesB[j]) {
				System.out.println("Intersection of Series A and Series B: "+seriesA[i]);
		 }
		}
	  }
	}		
		
	}

		

