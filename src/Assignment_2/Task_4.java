//4.	WAP  to enter the days of week and print name of  day-- switch case, Ladderif

package Assignment_2;

import java.util.Scanner;

public class Task_4 {
	  public static void main(String[] args) 
	  {
	    int num1;
		Scanner s=new Scanner(System.in);
	    System.out.print("Enter the number of the day (from 1-7): ");
	    num1 = s.nextInt();
	      switch(num1)
	      {
	          case 1:
	              System.out.println("Monday");
	              break;	
	          case 2:
	              System.out.println("Tuesday");
	              break;
	          case 3:
	              System.out.println("Wednesday");
	              break;
	          case 4:
	              System.out.println("Thursday");
	              break;
	          case 5:
	              System.out.println("Friday");
	              break;
	          case 6:
	              System.out.println("Saturday");
	              break;
	          case 7:
	              System.out.println("Sunday");
	              break;	              
	          default:
	              System.out.println("Enter a number between 1 and 7");
	              break;
	     }
        s.close();
      }
}
