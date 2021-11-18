//2.	Write a Java program to print the sum of two numbers.

package Assignment_1;
import java.util.Scanner;

public class Task_2 {
	  public static void main(String[] args) 
	  {
	    int num1,num2,sum;
		Scanner s=new Scanner(System.in);
	    System.out.print("Enter the first number: ");
	    num1 = s.nextInt();
	    System.out.print("Enter the second number: ");
	    num2 = s.nextInt();
	    sum = num1 + num2;
	    System.out.println("The sum of the 1st and 2nd number is: "+sum);
	  }
}
