// 5.	Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.

package Assignment_1;

import java.util.Scanner;

public class Task_5 {
	  public static void main(String[] args) 
	  {
	    int num1,num2,sum,sub,mul,div,rem;
		Scanner s=new Scanner(System.in);
	    System.out.print("Enter the first number: ");
	    num1 = s.nextInt();
	    System.out.print("Enter the second number: ");
	    num2 = s.nextInt();
	    sum = (num1 + num2);
	    sub = (num1 - num2);
	    mul = (num1 * num2);
	    div = (num1 / num2);
	    rem = (num1 % num2);
	    System.out.println("The addition is: "+sum);
	    System.out.println("The substract is: "+sub);
	    System.out.println("The multiply is: "+mul);
	    System.out.println("The divide is: "+div);
	    System.out.println("The reminder is: "+rem);
	    
	  }
}
