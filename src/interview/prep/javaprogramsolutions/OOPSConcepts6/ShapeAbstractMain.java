package interview.prep.javaprogramsolutions.OOPSConcepts6;

public class ShapeAbstractMain {

	public static void main(String[] args) {
		CalculateAreaPerimeterTriangle areaObj = new CalculateAreaPerimeterTriangle();
		float area = areaObj.calculateArea(5,7);
		System.out.println("Area of Triangele is in ShapeAbstractMain : " +area );
		double perimeter = areaObj.calculatePerimeter(5, 7, 9);
		System.out.println("Perimeter of Triangele is in ShapeAbstractMain : " +perimeter );
		areaObj.setSides (3);
		
		CalculateAreaPerimeterRectangle areaObj1 = new CalculateAreaPerimeterRectangle();
		float area1 = areaObj1.calculateArea(4,8);
		System.out.println("Area of Rectangle is in ShapeAbstractMain : " +area1 );
		double perimeter1 = areaObj1.calculatePerimeter(4,8);
		System.out.println("Perimeter of Rectangle is in ShapeAbstractMain : " +perimeter1 );
		areaObj1.setSides (4);
		

	}

}
