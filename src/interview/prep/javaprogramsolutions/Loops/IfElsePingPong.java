package interview.prep.javaprogramsolutions.Loops;

public class IfElsePingPong {
	
	public void pingPong(int n){
		if (n%3==0 && n%5==0){
			System.out.println("No is divisable by 3 and 5 : Ping Pong : " +n);
			} else if (n%3==0){
				System.out.println("No is divisable by 3 : Ping : " +n);
			} else if (n%5 == 0){
				System.out.println("No is divisable by 5 : Pong : " +n);
			}else 
				System.out.println("No is not divisable by 3 and 5 : " +n);
				
	}
	

	public static void main(String[] args) {
		IfElsePingPong ifElse = new IfElsePingPong();
		ifElse.pingPong(9);

	}

}
