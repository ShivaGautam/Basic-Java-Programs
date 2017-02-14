package interview.prep.javaprogramsolutions.OOPSConcepts6;

public class CircleMain {

	public static void main(String[] args) {
		Circle objCircle = new Circle(4);
		/*objCircle.noOfSides = 3;
		System.out.println("Set Number of Sides :" +objCircle.noOfSides);*/
		
		float area=objCircle.calculateArea(4);
		System.out.println("Area of Circle : " +area);
		

	}

}
