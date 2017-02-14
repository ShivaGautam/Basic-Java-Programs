package interview.prep.javaprogramsolutions.Collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx {

	//  			--> To create an arraylist and add elements to it.
		//--> To search for an element in the list.
		//--> To print the elements of the list using iterator.
	
	public void arrayList(){
		List <String> arrLis = new ArrayList <String> ();
		arrLis.add("Hi");
		arrLis.add("Hello");
		arrLis.add("World");
		
		for(String str: arrLis){
			System.out.println(str);
		}
		System.out.println("Element is present or not : " +arrLis.contains("Hi"));
	}

	public static void main(String[] args) {
		ArrayListEx al = new ArrayListEx();
		al.arrayList();

	}

}
