package interview.prep.javaprogramsolutions.Loops;

public class SwapsNumbers {
	
	public static  void swapsNo(int n1,int n2){
		int temp = 0;
		System.out.println("Before : First No " +n1);
		System.out.println("Before :Second No " +n2);
		temp=n1;
		n1=n2;
		n2=temp;
		
		System.out.println("After Swap: First No " +n1);
		System.out.println("After Swap:Second No " +n2);	
		
	}

	public static void swapsWithoutVariable(int n1,int n2){

		System.out.println("  ");
		System.out.println("Before : First No " +n1);
		System.out.println("Before :Second No " +n2);
		n1=n1-n2;
		
		n2=n2+n1;
		
		n1=n2-n1;
		System.out.println("After Swap: First No " +n1);
		System.out.println("After Swap:Second No " +n2);
	}
	
	public static void main(String[] args) {
		swapsNo(15,10);
		swapsWithoutVariable(15,20);

	}

}
