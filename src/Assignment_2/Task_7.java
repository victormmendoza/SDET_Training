//7.	WAP to check whether a number is even or odd.

package Assignment_2;

import java.util.Scanner;

public class Task_7 {
	  public static void main(String[] args) 
	  {
	    int num1;
		Scanner s=new Scanner(System.in);
	    System.out.print("Enter the number: ");
	    num1 = s.nextInt();

	    if ( num1 % 2 == 0 ) 
	    	System.out.println( num1 +" is even");
	    else      
	    	System.out.println( num1 +" is odd");
     s.close();
	  }
}
