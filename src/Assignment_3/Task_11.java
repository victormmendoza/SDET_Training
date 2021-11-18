package Assignment_3;

import java.util.Scanner;

public class Task_11 {
	public static void main(String args[])   
	{   
	    int num1,row,i,j,num,space;
		Scanner s=new Scanner(System.in);
	    System.out.println("Enter the pattern type number: \n1.Piramid of Numbers \n"
	    		+"2.Piramid of Star \n3.Right Triangle Star \n4.Reverse Star Piramid \n"
	    		+"5.Diamond Shape \n6.Binary numbers");
	    num1 = s.nextInt();
	      switch(num1)
	      {
	      case 1:
	    	  System.out.println("Piramid of Numbers");
	    	  System.out.print("Enter the number of rows you want to print: ");  
	    	  row = s.nextInt();  
	          int rowCount = 1;
	          System.out.println("Here Is Your Pattern:");
	          for (i = row; i > 0; i--)
	          {
	              for (j = 1; j <= i*2; j++)
	                  System.out.print(" ");
	              for (j = 1; j <= rowCount; j++)   
	                  System.out.print(j+" ");
	              for (j = rowCount-1; j >= 1; j--)
	                  System.out.print(j+" ");    
	              System.out.println();  
	              rowCount++;
	          }	       
	          break;
	      
	      case 2:
	    	  	System.out.println("Star piramid"); 
	    	  	System.out.print("Enter the number of rows you want to print: ");  
	    	  	row = s.nextInt();  
		        System.out.println("Here Is Your Pattern:");
	    		for (i=0; i<row; i++)   
	    		{  
	    			for (j=row-i; j>1; j--)  
	    				System.out.print(" ");
	    			for (j=0; j<=i; j++ )   
	    				System.out.print("* "); 
	    			System.out.println();   
	    		}   
	    		  
	    	  break;

	      case 3:
	    	  	System.out.println("Right Triangle Star");
	    	  	System.out.print("Enter the number of rows you want to print: ");  
	    	  	row = s.nextInt(); 	
		        System.out.println("Here Is Your Pattern:");
	    	  	for(i=0; i<row; i++)   
	    	  	{   
	    	  		for(j=0; j<=i; j++) 
	    	  			System.out.print("* ");  
	    	  		System.out.println();   
	    	  	}   	    	  	
	    	  	break;
	    	  	
	      case 4:
	    	  	System.out.println("Reverse star piramid");
	    	  	System.out.print("Enter the number of rows you want to print: ");  
	    	  	row = s.nextInt(); 
		        System.out.println("Here Is Your Pattern:");
	    	  	for (i= 0; i<= row-1; i++)  
	    	  	{  
	    	  		for (j=0; j<=i; j++)  
	    	  			System.out.print(" ");  
	    	  		for (int k=0; k<=row-1-i; k++)
	    	  			System.out.print("*" + " ");
	    	  		System.out.println();  
	    	  	}  
	    	  	break;
	      case 5:
	    	  	System.out.println("Diamond Shaped");
	    	  	space = 1;  
	    	  	System.out.print("Enter the number of rows you want to print: ");  
	    	  	row = s.nextInt();  
	    	  	space = row - 1; 
		        System.out.println("Here Is Your Pattern:");
	    	  	for (j = 1; j<= row; j++)  
	    	  	{  
	    	  		for (i = 1; i<= space; i++)  
	    	  			System.out.print(" ");  
	    	  		space--;  
	    	  		for (i = 1; i <= 2 * j - 1; i++)  
	    	  			System.out.print("*");  
	    	  		System.out.println("");  
	    	  	}  
	    	  	space = 1;  
	    	  	for (j = 1; j<= row - 1; j++)  
	    	  	{  
	    	  		for (i = 1; i<= space; i++)  
	    	  			System.out.print(" ");  
	    	  		space++;  
	    	  		for (i = 1; i<= 2 * (row - j) - 1; i++)  
	    	  			System.out.print("*");  
	    	  		System.out.println("");  
	    	  	}	    	  	
	    	  	break;
	      case 6:
	    	  	System.out.println("Binary numbers");
	    	  	System.out.print("Enter the number of rows you want to print: ");  
	    	  	row = s.nextInt(); 
		        System.out.println("Here Is Your Pattern:");
	    	  	for (int k = 1; k <= row; k++)   
	    	  	{  
	    	  		if(k%2 == 0)  
	    	  		{  
	    	  			num = 0;  
	    	  			for (int l = 1; l <= row; l++)  
	    	  			{  
	    	  				System.out.print(num);  
	    	  				num = (num == 0)? 1 : 0;  
	    	  			}  
	    	  		}  
	    	  		else  
	    	  		{  
	    	  			num = 1;  
	    	  			for (int l = 1; l <= row; l++)  
	    	  			{  
	    	  				System.out.print(num);  
	    	  				num = (num == 0)? 1 : 0;  
	    	  			}  
	    	  		}  
	    	  		System.out.println();  
	    	  	}  
	    	  	break;
	      }
			s.close();


	}
}
