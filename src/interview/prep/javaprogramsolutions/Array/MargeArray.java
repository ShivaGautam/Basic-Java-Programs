package interview.prep.javaprogramsolutions.Array;

public class MargeArray {
	

	public static void main(String[] args) {
		int [] array1={1,2,3,4};
		int [] array2={5,6,7,8,9};
		int [] margearray = new int [array1.length +array2.length];
		int i;
		System.out.println(" : " +array1.length);
		for (i=0;i<array1.length ; i++){
			System.out.println(" value of i : " +i);
			margearray[i] =array1[i];
		System.out.println("shift first array in marge: " +margearray[i]);
		
		}
		for (int k=0; k<array2.length; k++){
			System.out.println(" value of k : " +k);
			margearray[i++] =array2[k];
			System.out.println("shift first & second array in marge: " +margearray[k]);
		}
		for (int j=0;j<margearray.length;j++){
			System.out.println("marge : " +margearray[j]);
		}
	}
}
