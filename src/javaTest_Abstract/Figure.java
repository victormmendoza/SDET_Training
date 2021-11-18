package javaTest_Abstract;

public abstract class Figure {
	  private String toString;
	  double dim1;

	  public Figure() {
	    this.toString = "shape";
	  }

	  public Figure(String name) {
	    this.toString = name;
	  }

	  public String getName() {
	    return this.toString;
	  }

	  public void setName(String name) {
	    this.toString = name;
	    
	  }
	  // Abstract methods
	  public abstract double findArea();

	  public abstract double findPerimeter();
}
