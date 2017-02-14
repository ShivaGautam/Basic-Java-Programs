package interview.prep.javaprogramsolutions.OOPSConcepts6;

public class CalculateAreaPerimeterTriangle extends ShapeAbstractClass {

	@Override
	public float calculateArea(int base, int height ) {
		//base = 5;
		//height = 7;
		float area =  (base *  height)/2 ;
	    System.out.println("Area of Triangele is in CalculateAreaPerimeter : " +area );
	    return area;
		
		}

	@Override
	public double calculatePerimeter(double side1, double side2, double side3) {
		double perimeter = (side1 + side2 + side3);
		System.out.println("Perimeter of Triangele is in CalculateAreaPerimeter : " +perimeter);
		return perimeter;
	}

	@Override
	public double calculatePerimeter(double side1, double side2) {
		return 0;
	}

	@Override
	public float calculateArea(int radius) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	/*@Override
	public void setSides() {
		// TODO Auto-generated method stub
		
	}*/

}
