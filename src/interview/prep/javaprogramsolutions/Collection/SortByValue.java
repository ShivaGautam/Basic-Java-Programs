package interview.prep.javaprogramsolutions.Collection;


import java.util.Map;
import java.util.Set;
import java.util.TreeMap;


import interview.prep.collections.Student;

public class SortByValue {
	public void treeMapWithStudentObject(){
		
		Map<Student,Integer> map1 =new TreeMap<Student,Integer> (); 
		Student s1 = new Student(3351,"ShivaA");
		Student s2 = new Student(14555,"ShivaBcd");
		Student s3 = new Student(2341,"ShivaCdef");
		Student s4 = new Student(1245,"ShivaCghi");
		Student s5 = new Student(4561,"ShivaDefg");
		map1.put(s1,500);
		map1.put(s2,600);
		map1.put(s3,700);
		map1.put(s4,800);
		map1.put(s5,900);
		//Iteration 
		Set<Student> keys = map1.keySet();
		for(Student key : keys){
			System.out.println("Key id : "+key.id+" : name: " +key.name + " Value :"+map1.get(key));
		}
		
	}

	public static void main(String[] args) {
		SortByValue me = new SortByValue();
		//me.mapBasic();
		//me.treeMap();
		me.treeMapWithStudentObject();

	}
	

}