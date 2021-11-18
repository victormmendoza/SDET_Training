package javaTest_Abstract;

public class Triangle extends Figure
{ 
    private double dim2;
    private double dim3;

    public Triangle(double dim1, double dim2, double dim3) {
      // Set the shape toString as "Triangle"
      super("Triangle");
      this.dim1 = dim1;
      this.dim2 = dim2;
      this.dim3 = dim3;
    }

    
	// Implementation of findArea() method
    public double findArea() {
        // Heron's formula:
        // A = SquareRoot(s * (s - a) * (s - b) * (s - c)) 
        // where s = (a + b + c) / 2, or 1/2 of the perimeter of the triangle 
    	 double s = (dim1 + dim2 + dim3) / 2;
         return Math.sqrt(s * (s - dim1) * (s - dim2) * (s - dim3));
    }

	// Implementation of findPerimeter() method
    public double findPerimeter() {
        // P = a + b + c
        return dim1 + dim2 + dim3;
    }

}  
