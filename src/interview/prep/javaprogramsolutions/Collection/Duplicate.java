package interview.prep.javaprogramsolutions.Collection;

import java.util.HashSet;
import java.util.Set;

public class Duplicate {
	
	//Write a program to find duplicates in an array using set.
	
	public void setExample(){
		String [] setArray ={"a1","a2","a3","a2"};
		Set <String> setObj = new HashSet<String>(); //Set will not allowed the duplicate data,HashSet do not followed any order
		
		
		
		for(String str: setArray){
			System.out.println("" +str);
			if(setObj.add(str)){
				System.out.println("it's not duplicate :" +str);
			//System.out.println(setObj.add(str));
			
			}else{
				System.out.println("it's duplicate :" +str);
			}
			
			
		}
		for(String setARR : setObj)
		System.out.println(" Value in set collection : " +setARR);
	}

	public static void main(String[] args) {
		Duplicate se= new Duplicate();
		se.setExample();

	}

}
