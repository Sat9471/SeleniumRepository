package week3.day2;

public class ReverseEvenWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Declare the input as Follow
//      String test = "I am a software tester"; 
		String test = "I am a software tester";

//		split the words and have it in an array
//		It split the sentence based on the argument condition - here its is space (" ");
//		Whenever there is a space the word will be split and save it in the split array
		String[] split = test.split(" ");

//		 Traverse through each word (using loop)
		for (int i = 0; i < split.length; i++) {

//			find the odd index within the loop (use mod operator)
//			the index will start from 0. So we used 1%2!=0
//			Here it will use index[1] and index[3]
			if (i % 2 != 0) {

//				This will print the odd index words in the sentence
//				System.out.println(split[i]);

//				split the words and have it in an array
				char[] cha = split[i].toCharArray();

// cha will have each character and we need to rev the letter
//	for that we use temporary empty string rev			
				String rev = "";
				// am - length will be 2
				// 01 test and reverser will 10, then the output will be ma

//				print the even position words in reverse order using another loop (nested loop)
//				Here initial value starts with cha.length-1(since index starts with 0)
//				it iterates from cha.length-1 to the index 0
//				it iterates in decremental way that is j--
//				it will starts from index[cha.length-1] to the index[0]
//				if cha.length[5], then it will print 5 4 3 2 1 0
				for (int j = cha.length - 1; j >= 0; j--) {
//		    print the even words in the sentence in the array in letters
//			system.out.println(cha[j]);

					// cha[0]=m
					// cha[1]=a
					// this will print all the the letters in the even word continuous
					rev = rev + cha[j];
					// rev=m+a, here m wil be concatenate(adding) with a
					// rev=ma
				}
//			Convert words to character array if the position is even else print the word as it is(concatenate space at the end).
//			To print the text in the same line we need to remove ln
//			we use " " after adding rev to make a space after the reversed word	
				System.out.print(rev + " ");

			} else {
//			To print the text in the same line we need to remove ln or otherwise it will be printed in the different line
//			We use " " 	after the split[i] words to make space after the odd word
				System.out.print(split[i] + " ");
			}

		}
	}
}
