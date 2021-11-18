//5.	WAP to count total number of  500,100,50,20 and 10 notes in a given amount
package Assignment_2;

import java.util.Scanner;

public class Task_5 {
	  public static void main(String[] args) 
	  {
	    int num1;
		Scanner s=new Scanner(System.in);
	    System.out.print("Enter the number: ");
	    num1 = s.nextInt();
	    
	    if ( num1 >= 500 ) {
	    	int note500; 
	    	note500 = num1/500;
	    	num1 = num1 - (note500 * 500);
	    	System.out.println( "500: "+ note500);
	    }
	    if ( num1 >= 100 ) {
	    	int note100; 
	    	note100 = num1/100;
	    	num1 = num1 - (note100 * 100);
	    	System.out.println( "100: "+ note100);
	    }
	    if ( num1 >= 50 ) {
	    	int note50; 
	    	note50 = num1/50;
	    	num1 = num1 - (note50 * 50);
	    	System.out.println( "50: "+ note50);
	    }
	    if ( num1 >= 20 ) {
	    	int note20; 
	    	note20 = num1/20;
	    	num1 = num1 - (note20 * 20);
	    	System.out.println( "20: "+ note20);
	    }
	    if ( num1 >= 10 ) {
	    	int note10; 
	    	note10 = num1/10;
	    	num1 = num1 - (note10 * 10);
	    	System.out.println( "10: "+ note10);
	    }
     s.close();
	  }
}
