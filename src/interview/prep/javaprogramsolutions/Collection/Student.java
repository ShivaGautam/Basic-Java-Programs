package interview.prep.javaprogramsolutions.Collection;

public class Student implements Comparable <Student> {
	
	public String name;
	public int id;

	public Student(int id, String name){
		this.id =id;
		this.name = name;
	}
	@Override
	public int compareTo(Student o) {
		
		//Sort by id value
		/*int result =0;
		if(o.id > this.id){
			result = 1;
		}else if(o.id < this.id){
			result =-1;
		}*/
		
		//Sort by lexographic order or alphabetic order
		return this.name.compareTo(o.name);
	}

}
