package interview.prep.javaprogramsolutions.Array;

public class MissingNum {

	public static void main(String[] args) {
		int[] missingNo = { 50, 51, 52, 54, 55 };
		
		int nextNum = missingNo[0];

		System.out.println("first missing no  " + missingNo[0]);
		for (int i = 0; i < missingNo.length; i++) {
			if (nextNum == missingNo[i]) {
				nextNum = missingNo[i] + 1;
				System.out.println("increment value in array no : " + nextNum);
			}
			
		}

		System.out.println("after false it is a missing no. :  " + nextNum);
		
	}
}
