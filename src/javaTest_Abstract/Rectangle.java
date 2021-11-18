package javaTest_Abstract;

public class Rectangle extends Figure
{   
    private double dim2;

    public Rectangle(double dim1, double dim2) {
      // Set the shape toString as "Rectangle"
   	  super("Rectangle");
      this.dim1 = dim1;
      this.dim2 = dim2;
    }


    // Implementation of findArea() method
    public double findArea() {
      return dim1 * dim2;
    }

    // Implementation of findPerimeter() method
    public double findPerimeter() {
      return 2.0 * (dim1 + dim2);
    }
    
}
