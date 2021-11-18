//2.	Write a Java program to find the number of days in a month.
package Assignment_2;

import java.util.Scanner;

public class Task_2 {
	  public static void main(String[] args) 
	  {
	    int num1;
		Scanner s=new Scanner(System.in);
	    System.out.print("Enter Month Number from 1 to 12: ");
	    num1 = s.nextInt();
		if (num1 == 1 || num1 == 3 || num1 == 5 || num1 == 7 || num1 == 8 || num1 == 10 || num1 == 12 )
			System.out.println("There are 31 Days in this Month");  	    
		else if ( num1 == 4 || num1 == 6 || num1 == 9 || num1 == 11 )
			System.out.println("There are 30 Days in this Month");  	  
		else if ( num1 == 2 )
			System.out.println("There are either 28 or 29 Days in February");  	
		else
			System.out.println("Enter a number between 1 to 12");
        s.close();
	  }
}
