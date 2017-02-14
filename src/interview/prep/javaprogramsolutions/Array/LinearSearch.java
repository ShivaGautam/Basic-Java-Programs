package interview.prep.javaprogramsolutions.Array;

public class LinearSearch {
	
	
	
	public static void main(String[] args) {
		int n=70;
	    int[] array1={40,50,60};
	    boolean isElementFound = false;
	    
	    for(int i=0 ; i<array1.length; i++){
	    	if(n==array1[i]){
	    		//System.out.println("Search completed,Element Found: " +n);
	    		isElementFound=true;
	    	}
	    	
	    }
	    if(isElementFound){
	    	System.out.println("Search completed,Element Found: " +n);
	    }else {
	    	System.out.println("Search completed,Element not Found: " +n);
	    }
	    

	}

}
