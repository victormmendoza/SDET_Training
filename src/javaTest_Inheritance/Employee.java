package javaTest_Inheritance;

public class Employee {
	int empId;
	String empName;
	int total_leaves;
	double total_salary;
	
	
	private String name;
	  double dim1;

	  public void calculate_balance_leave () {
	    this.total_leaves = "Unknown shape";
	  }

	  public Figure(String name) {
	    this.name = name;
	  }

	  public String getName() {
	    return this.name;
	  }

	  public void setName(String name) {
	    this.name = name;
	    
	  }
	  // Abstract methods
	  public abstract double findArea();

	  public abstract double findPerimeter();
}
