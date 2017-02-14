package interview.prep.javaprogramsolutions.Collection;

import java.util.ArrayList;

import java.util.List;


public class CopyArrayList {

	
	//Write a program to copy arraylist to an array.
	public void copyArray(){
		
		List <String> listObj = new ArrayList<String>();
		listObj.add("Shiva");
		listObj.add("Shiva1");
		listObj.add("Shiva2");
		String [] copyArr = new String[listObj.size()];
		for(int i=0; i<=listObj.size()-1;i++){
			System.out.println(" Element of Array List : " +listObj.get(i));
			copyArr [i] =listObj.get(i);
			System.out.println("Copy element in array from array list : " +copyArr[i]);
		}
	}
	public static void main(String[] args) {
		CopyArrayList ca = new CopyArrayList();
		ca.copyArray();

	}

}
