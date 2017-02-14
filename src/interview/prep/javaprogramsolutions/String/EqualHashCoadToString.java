package interview.prep.javaprogramsolutions.String;

public class EqualHashCoadToString {
	
	public void equalMeth(){
		String s1 ="Shiva";		//when we create two reference with the same literal it will create only one memory space in StrinPool Constant
		String s2 ="Gautam"; 	//Shiva	//when we compare two reference we will get the same result
		if (s1.equals(s2)){
			System.out.println(" ");
			System.out.println("Both String are equal");
		}else{
			System.out.println(" ");
			System.out.println("Both String are not equal");
		}
		
		
	}
	public void stringVali(String s){
		System.out.println(s.toString()); //This is String type toString
	}
	 

	public static void main(String[] args) {
		ToStringOverloading ts = new ToStringOverloading();
		
		System.out.println(ts.toString()); //This is Object type toString
		System.out.println("this is the hashcode value for the object created for class: "+ts.hashCode());// This is Object hascoad
		
		EqualHashCoadToString ehcts = new EqualHashCoadToString();
		ehcts.equalMeth();

	}

}
