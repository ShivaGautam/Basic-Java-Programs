package interview.prep.javaprogramsolutions.Loops;

public class PrintStarLoop {
	
	public void starPrint(int input){
		for (int i =1 ;i <=input ;i++){
			for (int j =1 ; j<=i ;j++){
				System.out.print("*");
			}
			System.out.println(" ");
		}
		
	}

	public static void main(String[] args) {
		PrintStarLoop sp = new PrintStarLoop();
		sp.starPrint(5);

	}

}
