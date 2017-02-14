package interview.prep.javaprogramsolutions.String;

import java.util.Scanner;

public class BalanceParantheses {

	// . Write a program to check if a given string of parenthesis has balanced
	// parenthesis or not.
	// For example a string as "(())" is a valid string where as strings like
	// ")(" or "(()))" are not valid strings.

	public static void main(String[] args) {
		String actual, palin = "";
		int oc = 0, cc = 0;
		Scanner in = new Scanner(System.in);

		System.out.println("Enter a string to check if it is a palindrome");
		actual = in.nextLine();

		int length = actual.length();
		boolean isOpenTrue=false;
		if (("(").equals(""+actual.charAt(0))){
			isOpenTrue=true;
		}
		
		System.out.println("length of a parenthesis : " + length);
//()
		for (int i = 0; i <= length - 1; i++) {
			palin = "" + actual.charAt(i);
			//(
			System.out.println("Parentheses:" + palin);

			if (palin.equals("(") ){
				
				System.out.println("Increment Open Counter.");
				oc++;
			} else if(palin.equals(")")) {
				System.out.println("Incerment Close Counter.");
				cc++;
			}
		}
			if (oc == cc && isOpenTrue) {
				System.out.println("Entered string is Balance Parenthes.");
			} else {
				System.out.println("Entered string is not a Balance Parenthes.");
			}
		
		in.close();

	}

}
