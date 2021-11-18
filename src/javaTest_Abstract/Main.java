/*
 * Create an abstract class Figure with following properties and functions
Properties:
	double dim1;
Methods:
	abstract void findArea();
	abstract void findPerimeter();

Create three subclasses Cirlce, Rectangle and Triangle that extends Figure class with following properties and functions

Circle
Methods:
	override void findArea()
	override void findPerimeter()
	public void toString()

Rectangle
Properties
	double dim2;
Methods:
	override void findArea()
	override void findPerimeter()
	public void toString()

Triangle
Properties:
	double dim2, dim3;
Methods:
	override void findArea()
	override void findPerimeter()
	public void toString()

Write a program that will find the area and perimeter of 8 Figures and print the details for all.
The 8 Figures include: 2 Circles, 2 Squares, 2 Rectangles and 2 Triangles.
(Hint: Use an array to store all the 8 Figures.)

 */

package javaTest_Abstract;

import java.util.Scanner;

public class Main {
		  public static void main(String[] args) {  
			String n;
			int dim1,dim2, dim3;
  		    Figure[] shapeList = new Figure[2];

			System.out.print("WELCOME \nPlease let me know what figure you want to calculate the"
					+ " perimeter and area (C)-Circle (R)-Rectangle (T)-Triangle (S)-Square\n");			
			Scanner s=new Scanner(System.in);	
			n = s.nextLine();		
			String str = n.toLowerCase();
		      switch(str)
		      { 
		          case "c":`
		  		    System.out.print("1st circle:\nRadius: ");
		  		    dim1 = s.nextInt();		  		    
		        	shapeList[0] = new Circle(dim1);
		        	
		  		    System.out.print("\n2nd circle:\nRadius:");
		  		    dim1 = s.nextInt();		  		    
		        	shapeList[1] = new Circle(dim1);
		        	
					s.close();
					break;
					
		          case "r":
		  		    System.out.print("1st Rectangle: \nwidth: ");
		  		    dim1 = s.nextInt();		  		    
		  		    System.out.print("length: ");
		  		    dim2 = s.nextInt();		  		    
		  		    shapeList[0] = new Rectangle(dim1, dim2);
		  		    
		  		    System.out.print("\n2nd Rectangle: \nwidth: ");
		  		    dim1 = s.nextInt();		  		    
		  		    System.out.print("length: ");
		  		    dim2 = s.nextInt();		  		    
		  		    shapeList[1] = new Rectangle(dim1, dim2); 	
		  		    s.close();
					break;
					
		          case "t":
		  		    System.out.print("1st Triangle: \nSide 1: ");
		  		    dim1 = s.nextInt();		  		    
		  		    System.out.print("Side 2: ");
		  		    dim2 = s.nextInt();		  		    
		  		    System.out.print("Side 3: ");
		  		    dim3 = s.nextInt();	
		  		    shapeList[0] = new Triangle(dim1, dim2, dim3); 

		  		    System.out.print("\n2nd Triangle: \nSide 1: ");
		  		    dim1 = s.nextInt();		  		    
		  		    System.out.print("Side 2: ");
		  		    dim2 = s.nextInt();		  		    
		  		    System.out.print("Side 3: ");
		  		    dim3 = s.nextInt();	
		  		    shapeList[1] = new Triangle(dim1, dim2, dim3);

					s.close();
					break;
					
		          case "s":
		  		    System.out.print("1st Square: \nside: ");
		  		    dim1 = s.nextInt();	
		  		    dim2 = dim1;		  		    
		  		    shapeList[0] = new Rectangle(dim1, dim2);
		  		    
		  		    System.out.print("\n2nd Square: \nside: ");
		  		    dim1 = s.nextInt();	
		  		    dim2 = dim1;	  		    
		  		    shapeList[1] = new Rectangle(dim1, dim2); 	
		  		    s.close();
					break;
		      }  

		    // Print details of all shapes
		    getData.printShapeDetails(shapeList);

		  }
		  
}
