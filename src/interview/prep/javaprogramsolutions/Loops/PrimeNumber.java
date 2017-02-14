package interview.prep.javaprogramsolutions.Loops;

public class PrimeNumber {
	
	public static boolean isPrime(int n){
		for (int i=2;i<n ;i++){
			if(n%i==0){
			System.out.println("No is not prime. " +n);
			return false;
		}
			
		}
		System.out.println("No is prime. " +n);
		return true;
	}
	

	public static void main(String[] args) {
		boolean noPrime = isPrime(13);
		System.out.println("return Value from main. " +noPrime);
		

	}

}
