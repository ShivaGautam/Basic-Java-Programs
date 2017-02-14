package interview.prep.javaprogramsolutions.Loops;

import java.util.Scanner;

public class InputFromCommandLine {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("enter name : " );
		String name =scanner.next();
		System.out.print("enter age : " );
		int age = scanner.nextInt();
		
		System.out.print("My name is : "+name+ " And My age is : "  +age);
		scanner.close();

	}

}
