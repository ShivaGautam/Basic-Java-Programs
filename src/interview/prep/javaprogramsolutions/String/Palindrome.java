package interview.prep.javaprogramsolutions.String;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		String actual ,palin="";
		 Scanner in = new Scanner(System.in);
		 
	      System.out.println("Enter a string to check if it is a palindrome");
	      actual = in.nextLine();
	      
	      int length = actual.length();
	      System.out.println("length of a palindrome : " +length);
	      
	      for ( int i = length - 1; i >= 0; i-- ){
	          palin = palin + actual.charAt(i);
	          System.out.println("value in palin:" +palin); 
	      }
	      if (actual.equals(palin)){
	          System.out.println("Entered string is a palindrome.");
	      }else{
	          System.out.println("Entered string is not a palindrome.");
	      }
	      in.close();
	  
	      
	}

}

