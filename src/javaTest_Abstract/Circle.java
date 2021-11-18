package javaTest_Abstract;


public class Circle extends Figure
{
	  private double dim1;

	  public Circle(double dim1) {
		// Set the shape toString as "Circle"
	    super("Circle");
	    this.dim1 = dim1;
	  }


	  // Implementation of findArea() method
	  public double findArea() {
	    return Math.PI * dim1 * dim1;
	  }

	  // Implementation of findPerimeter() method
	  public double findPerimeter() {
	    return 2.0 * Math.PI * dim1;
	  }
    
}
