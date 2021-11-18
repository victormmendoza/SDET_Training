//2. Whether strings are anagram or not?

package Assignment_4;

import java.util.Arrays;
import java.util.Scanner;

public class Task_2 {
	  public static void main(String[] args) { 
		  Scanner s= new Scanner(System.in); 
		  System.out.print("Enter one string: ");
		  String str1= s.nextLine(); 		  
		  Scanner sc= new Scanner(System.in); 
		  System.out.print("Enter a second string: ");
		  String str2= sc.nextLine();   
		  str1 = str1.toLowerCase();
		  str2 = str2.toLowerCase();
		  if(str1.length() == str2.length()) {
			  char[] charArray1 = str1.toCharArray();
		      char[] charArray2 = str2.toCharArray();
		      Arrays.sort(charArray1);
		      Arrays.sort(charArray2);
		      boolean result = Arrays.equals(charArray1, charArray2);
		      if(result) 
		        System.out.println(str1 + " and " + str2 + " are anagram.");
		      else
		        System.out.println(str1 + " and " + str2 + " are not anagram.");
		    }
		    else 
		      System.out.println(str1 + " and " + str2 + " are not anagram.");
		  s.close();
		  sc.close();
		  }
	  	
	  	
	  }
