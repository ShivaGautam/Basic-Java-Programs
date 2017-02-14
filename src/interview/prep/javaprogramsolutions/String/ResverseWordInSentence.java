package interview.prep.javaprogramsolutions.String;

public class ResverseWordInSentence {
	
	public void reverseWord(String s){
		String s4 = "";
		char s3 = 0;
		for (int i= s.length() - 1; i>=0 ;i--){
			//System.out.println(i);
			
			s3 = s.charAt(i);
			s4= s4 +""+s3 +""; 
		
	}
		System.out.print("Revese String : " +s4);
	}

	public static void main(String[] args) {
		ResverseWordInSentence rs = new ResverseWordInSentence();
		rs.reverseWord("Ramaya is my daughter");
		

	}

}
