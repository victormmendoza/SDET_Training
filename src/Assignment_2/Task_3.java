//3.	Check whether a number is divisible by 5 and 11
package Assignment_2;

import java.util.Scanner;

public class Task_3 {
	  public static void main(String[] args) 
	  {
	    int num1;
		Scanner s=new Scanner(System.in);
	    System.out.print("Enter the first number: ");
	    num1 = s.nextInt();
		if (num1 % 5 == 0 && num1 % 11 == 0 )
			System.out.println("The number "+num1+" is divisible by 5 and 11");  	
	    else
	    	System.out.println("The number "+num1+" is not divisible by 5 and 11");
        s.close();
	  }
}
