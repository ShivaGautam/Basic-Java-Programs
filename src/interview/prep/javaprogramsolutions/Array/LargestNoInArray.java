package interview.prep.javaprogramsolutions.Array;

public class LargestNoInArray {

	public static void main(String[] args) {
		int [] ArrayNumber = {45,54,96,65,78};
		int max =0;
		for (int i =0 ;i<ArrayNumber.length ;i++){ 		//For loop is working 5 time and index is begin with 0. i=0 ;0<4 
														// condt^n is true it comes inside the loop. First it will check 
														//If condition (value in ArrayNumber[0] = 45 which is greater then 0
														//If condition is true it will go inside the loop
														// Now max =ArrayNumber[0] , which is max=45, and loop get incremented after this.
			if(ArrayNumber[i]> max){
				max = ArrayNumber[i];
			}
		}
		System.out.println("max number is  " + max);
	}

}
