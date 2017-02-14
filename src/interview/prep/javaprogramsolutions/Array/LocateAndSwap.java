package interview.prep.javaprogramsolutions.Array;

public class LocateAndSwap {
	
	public int[] getSortedArray(int[]array){
	int temp;

	int size = array.length;

	for (int i = 0; i < size - 1; i++) {

		for (int j = 0; j < size - (i + 1); j++) {
			
			
			//System.out.println("Value of i :" + i);
			//System.out.println("Value of j :" + j);
			if (array[j] > array[j + 1]) {
				temp = array[j];
				//System.out.println("Value of temp :" + temp);
				array[j] = array[j + 1];
				//System.out.println("Value in array j :" + array[j]);
				array[j + 1] = temp;

				//System.out.println("Value in array j+1 :" + array[j + 1]);
			}

		}
	}
	
	
	return array;
	
	}
	
	public void compareArray(int[] array1, int []array2){
		
		System.out.println("Same elements in both Array :" + array1[4] +"***"+array2[4]);
	}
	
	
	    
	

	public static void main(String[] args) {
		
		 int[]unSortedArray1= {1,2,5,6,4};
		  int[] sortedArray1;
		 //{1,2,4,5,6};
		 LocateAndSwap objLocateAndSwap=new LocateAndSwap();
		 
//		 for (int i = 0; i <= unSortedArray1.length - 1; i++) {
//				System.out.println("Un sorted array :" + unSortedArray1[i]);
//			}
		 
		 sortedArray1= objLocateAndSwap.getSortedArray(unSortedArray1);
		 
		// objLocateAndSwap.compareArrays(unSortedArray1, sortedArray1);
		 
//		 for (int i = 0; i <= sortedArray1.length - 1; i++) {
//				System.out.println("sorted array :" + sortedArray1[i]);
//			}
		 
		 
		 // compare array elements to find unsorted numbers
		 
		// System.out.println("Same elements in both Array :" + unSortedArray1.toString() +"***"+sortedArray1[4]);
		
		 for (int i = 1; i <= unSortedArray1.length - 1; i++) {
			 for (int j = 1; i <=sortedArray1.length - 1; j++)
			 
			  if(unSortedArray1[i] == sortedArray1[j]){
				  
				  System.out.println("Same elements in both Array :" + unSortedArray1[i] +"***"+sortedArray1[j]);
			  }
			  else {
				  
				  System.out.println("Diff elements in both Array :" + unSortedArray1[i]);
			  }
				  
			 
			}
		
		 
		 

	}
}


