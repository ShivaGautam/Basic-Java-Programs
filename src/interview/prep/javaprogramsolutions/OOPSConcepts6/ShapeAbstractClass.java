package interview.prep.javaprogramsolutions.OOPSConcepts6;

public abstract class ShapeAbstractClass {
	public int noOfSides;
	public float area;
	public int perimeter;
	
	//Concrete Method
	public void setSides(int Sides){
		noOfSides =Sides;
		System.out.println("No of Sides : " + noOfSides );
	}
	
	//Abstract Method
	//calculateArea,calculatePerimeter,setSides.
	//area of triangle =(base*hight)/2 , area of rectangle = length * width
	//Parameter of triangle  =side1+side2+side3 , Parameter of rectangle  =2(length+width) 
	
	public abstract float calculateArea (int base, int height );  //Overloading Method
	
	public abstract float calculateArea (int radius );            //Overloading Method
	
	
	public abstract double calculatePerimeter (double side1, double side2, double side3);       //Overloading Method
	
	public abstract double calculatePerimeter (double side1, double side2);             //Overloading Method
	
	/*public abstract void setSides ();*/
	

}
