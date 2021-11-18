//7.	Write a Java program that takes three numbers as input to calculate and print the average of the numbers.

package Assignment_1;

import java.util.Scanner;

public class Task_7 {
	  public static void main(String[] args) 
	  {
	    int num1,num2,num3,ave;
		Scanner s=new Scanner(System.in);
	    System.out.print("Enter the first number: ");
	    num1 = s.nextInt();
	    System.out.print("Enter the second number: ");
	    num2 = s.nextInt();
	    System.out.print("Enter the third number: ");
	    num3 = s.nextInt();	    
	    ave = (num1 + num2 + num3)/3;
	    System.out.println("The average is: "+ave);
	  }
}
