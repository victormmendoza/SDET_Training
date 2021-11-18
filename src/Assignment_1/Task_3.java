//3.	Write a Java program to divide two numbers and print on the screen.
package Assignment_1;

import java.util.Scanner;

public class Task_3 {
	  public static void main(String[] args) 
	  {
	    double num1,num2,div;
		Scanner s=new Scanner(System.in);
	    System.out.print("Enter the first number: ");
	    num1 = s.nextInt();
	    System.out.print("Enter the second number: ");
	    num2 = s.nextInt();
	    div = (num1 / num2);
	    System.out.println("The division of the 1st and 2nd number is: "+div);
	  }
}
