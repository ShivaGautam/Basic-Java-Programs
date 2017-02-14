package interview.prep.javaprogramsolutions.OOPSConcepts6;

public class CalculateAreaPerimeterRectangle extends ShapeAbstractClass {

	@Override
	public float calculateArea(int base, int width) {
		float area1 =  base *  width;
	    System.out.println("Area of Rectangle is in CalculateAreaPerimeter : " +area1);
	    return area1;
	}

	@Override
	public double calculatePerimeter(double side1, double side2, double side3) {
		return 0;
	}

	@Override
	public double calculatePerimeter(double side1, double side2) {
		double perimeter1 = 2 * (side1 + side2);
		System.out.println("Perimeter of Triangele is in CalculateAreaPerimeter : " +perimeter1);
		return perimeter1;
	}

	@Override
	public float calculateArea(int radius) {
		// TODO Auto-generated method stub
		return 0;
	}

}
