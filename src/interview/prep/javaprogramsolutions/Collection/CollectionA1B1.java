package interview.prep.javaprogramsolutions.Collection;

import java.util.ArrayList;
import java.util.List;


public class CollectionA1B1 {
	
	//WAP produces output as a1,b1,a2,b2,a3,b3.......,an,bn.
	
	public void setExamp(){
		List <String> listValue = new ArrayList<String>();
		listValue.add("a1");
		listValue.add("a2");
		listValue.add("a3");
		listValue.add("a4");
		
		List <String> listValue1 = new ArrayList<String>();
		listValue1.add("b1");
		listValue1.add("b2");
		listValue1.add("b3");
		listValue1.add("b4");
		
		
		//System.out.println("Element is present or not : " +setValue.contains("a1"));
		
		/*for(String stval1 : setValue1){
			//System.out.println(stval1);
			for(String stval : setValue){
			System.out.println(stval);
			}
			System.out.println(stval1);
		}*/
		
		for(int i=0;i<=listValue.size()-1;i++){
			System.out.print(listValue.get(i)+ "," +listValue1.get(i)+",");
		}
	}

	public static void main(String[] args) {
		CollectionA1B1 se = new CollectionA1B1();
		se.setExamp();

	}

}
