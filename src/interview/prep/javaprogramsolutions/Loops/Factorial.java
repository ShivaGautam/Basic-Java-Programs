package interview.prep.javaprogramsolutions.Loops;

public class Factorial {
	static int fact =1;
	public static void facts(int n){
		int fact=1;
		System.out.println("method call  " +n);
		while(n>=1){
			
			fact= fact*n;
			System.out.println("first 2 number " +fact);
			n--;
			System.out.println("value of n " +n);
			
		}
		System.out.println("Factorial :  " +fact);
		System.out.println(" ");
	}
	
	
	public static void factRecursion(int n){
		
		System.out.println("Factorial start :  " +fact);
		if(n>1){
			fact=fact*n;
			factRecursion(n-1);
			
		}
		
	}
	
	public static void main(String[] args) {
		facts(4);
		factRecursion(4);
		
		System.out.println("Factorial from Recursion :  " +fact);

	}

}
