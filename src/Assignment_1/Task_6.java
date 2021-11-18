/*
6.	Write a Java program to print the area and perimeter of a circle.r - 
	Hint(Area - 3.14 *r*r, perimeter – 2*3.14*r)

 */

package Assignment_1;

import java.util.Scanner;

public class Task_6 {
	  public static void main(String[] args) 
	  {
	    int num1,num2,sum;
		Scanner s=new Scanner(System.in); 
		System.out.print("Enter the radius of the circle: ");
	    double r = s.nextDouble();
	    System.out.println("Perimeter is = " + (2 * r * Math.PI));
	    System.out.println("Area is = " + (Math.PI * r * r));
	  }
}
