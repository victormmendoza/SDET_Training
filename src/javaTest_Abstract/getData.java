package javaTest_Abstract;

public class getData {

		  public static void printShapeDetails(Figure[] list) {
		    for (int i = 0; i < list.length; i++) {
		      // Gather details about the shape		    
		      String name = list[i].getName(); 
		      double area = list[i].findArea(); 
		      double perimeter = list[i].findPerimeter(); 

		      // Print details
		      System.out.println("\nName: " + name + "-" + (i+1));
		      System.out.println(" - Area: " + area);
		      System.out.println(" - Perimeter: " + perimeter);
		    }
		  }
}