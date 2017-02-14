package interview.prep.javaprogramsolutions.OOPSConcepts6;

public class Circle extends ShapeAbstractClass implements IShapeConstants{
	
	public double radius;

	public Circle(){
		noOfSides =3;
		System.out.println("Set Number of Sides :" +noOfSides);
	}
	
	public Circle(int Sides){
		noOfSides = Sides;
		System.out.println("Set Number of Sides :" +noOfSides);
	}
	@Override
	public float calculateArea(int base, int height) {
		return 0;
	}

	@Override
	public double calculatePerimeter(double side1, double side2, double side3) {
		
		return 0;
	}

	@Override
	public double calculatePerimeter(double side1, double side2) {
		
		return 0;
	}

	@Override
	public float calculateArea(int radius) {
		double area =PI*radius*radius;
		return (float) area;
		
	}

}
