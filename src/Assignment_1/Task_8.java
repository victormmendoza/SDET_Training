//8.	Write a Java program to print the area and perimeter of a rectangle.

package Assignment_1;

import java.util.Scanner;

public class Task_8 {
	  public static void main(String[] args) 
	  {
	    int num1,num2,per,area;
		Scanner s=new Scanner(System.in);
	    System.out.print("Enter the length: ");
	    num1 = s.nextInt();
	    System.out.print("Enter the width: ");
	    num2 = s.nextInt();
	    per = 2*(num1 + num2);
	    area = num1 * num2;
	    System.out.println("The perimeter is: "+per);
	    System.out.println("The area is: "+area);
	  }
}
