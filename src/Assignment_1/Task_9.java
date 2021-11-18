//9.	Write a Java program that reads an integer between 0 and 1000 and adds all the digits in the integer. For eg: 456 
package Assignment_1;

import java.util.Scanner;

public class Task_9 {
	  public static void main(String[] args) 
	  {
	    int num1,num2,sum;
		Scanner s=new Scanner(System.in);
	    System.out.print("Enter an integer between 0 and 1000: ");
	    num1 = s.nextInt();
	    sum = 0; 
	    if(num1 < 1000)
        	{
	    	while (num1 != 0) 
		    { 
		    sum = sum + (num1 % 10); 
		    num1 = num1 / 10;	 
		    }
		    System.out.println(sum); 
        	}
        else
        {
            System.out.println("number is bigger than 1000");
        }
	  }	  
}
