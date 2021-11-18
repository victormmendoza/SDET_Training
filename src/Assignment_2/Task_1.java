//1.	Write a Program to check  whether  number is positive or negative number.
package Assignment_2;

import java.util.Scanner;

public class Task_1 {
	  public static void main(String[] args) 
	  {
	    int num1;
		Scanner s=new Scanner(System.in);
	    System.out.print("Enter the number: ");
	    num1 = s.nextInt();
        if(num1 > 0)
            System.out.println(num1+" is positive number");
        else if(num1 < 0)
            System.out.println(num1+" is negative number");
        else
            System.out.println(num1+" is neither positive nor negative");
        s.close();
	  }
}
