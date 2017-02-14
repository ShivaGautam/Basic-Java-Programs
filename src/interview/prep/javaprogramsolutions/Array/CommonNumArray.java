package interview.prep.javaprogramsolutions.Array;

public class CommonNumArray {

	public static void main(String[] args) {
		int [] array1 ={40,50,60};
		int [] array2 ={20,30,60};
		
		
		for(int i=0 ;i<array1.length ; i++){
		//System.out.println("i value : " +array1[i]);
		for(int j=0 ;j<array2.length;j++){
			//System.out.println("j value : " +array2[j]);
			if(array1[i]==array2[j]){
				
				System.out.println("common value : " +array2[j]);
			}
		}
		

	}

}
}
