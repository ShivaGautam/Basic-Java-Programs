package interview.prep.javaprogramsolutions.String;


//Write a program to find a substring in a given string and then replace it with another string.
public class FindAndReplaceSubString {
	
	public void findReplace(){
	String j3="gautam";
	System.out.println("replace the value of the character : " +j3.replace('a', 'h')); //replace all 'a' with 'h'
	
	}
	
	public static void main(String[] args) {
		FindAndReplaceSubString fr = new FindAndReplaceSubString();
		fr.findReplace();

	}

}
