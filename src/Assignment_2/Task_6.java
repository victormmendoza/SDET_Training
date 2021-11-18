//6.	Write a Java program to compare two numbers.
package Assignment_2;

import java.util.Scanner;

public class Task_6 {
	  public static void main(String[] args) 
	  {
	    int num1,num2;
		Scanner s=new Scanner(System.in);
	    System.out.print("Enter the first number: ");
	    num1 = s.nextInt();
	    System.out.print("Enter the second number: ");
	    num2 = s.nextInt();

	    if ( num1 == num2 ) 
	    	System.out.println( num1 +" is equal to "+ num2);
	    else if ( num1 < num2 )     
	    	System.out.println( num1 +" is smaller than "+ num2);
	    else if ( num1 > num2 )          
	    	System.out.println( num1 +" is bigger than "+ num2);
       s.close();
	  }
	
}
