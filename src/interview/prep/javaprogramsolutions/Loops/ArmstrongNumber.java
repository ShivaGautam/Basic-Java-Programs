package interview.prep.javaprogramsolutions.Loops;

public class ArmstrongNumber {
	int n,r,q,c =0,temp=0;
	
	public void calculateArms(int n){
		temp=n;
		while(n>0){
			
			r=n%10;
			System.out.println("print reminder :" +r) ;
			n=n/10;
			System.out.println("print quesent :" +n) ;
			c=c+(r*r*r);
			System.out.println("calculate :" +c); 
			
		}
		if(temp==c){
			System.out.println("Number is armstrong :" +c) ;
		}else
		System.out.println("Number is not armstrong :" +n) ;
	}
	
	public static void armsString(int n){
		String str = ""+n;		//converting integer to string
		int length1= str.length(); 	//get the length of the string
		System.out.println(length1);
		char result1 = str.charAt(0); 	//get the first value from the string and get output as a character
		System.out.println(result1);
		int first =Integer.parseInt(result1 +""); //convert character into string 
		System.out.println(first);
		char result2 = str.charAt(1);
		System.out.println(result2);
		int second =Integer.parseInt(result2 +"");
		System.out.println(second);
		char result3 = str.charAt(2);
		System.out.println(result3);
		int third =Integer.parseInt(result3 +"");
		System.out.println(third);
		int total = (int)(Math.pow(first, length1))+(int)(Math.pow(second, length1))+(int)(Math.pow(third, length1));
		//int tmp=(int) (Math.pow(third, length1));
		int a = (int)(Math.pow(second, length1));	// calculate power of number and convert double to integer
		System.out.println("qube1 :" +a);
		System.out.println("number is armstrong1 : "+total);
	
		if(total==n){
			System.out.println("number is armstrong");
		}else{
			System.out.println("number is not armstrong");
		}
		
		
	}
	

	public static void main(String[] args) {
		//ArmstrongNumber an = new ArmstrongNumber();
	   armsString(153);
		//an.calculateArms(371);

	}

}
