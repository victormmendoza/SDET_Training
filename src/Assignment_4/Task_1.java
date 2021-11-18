//1. WAP to determine whether a string has unique characters or not.? Ex. i/p java – o/p false

package Assignment_4;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Task_1 {
	  public static void main(String[] args) throws Exception {

		    Scanner s = new Scanner(System.in);

		    System.out.println("Please enter a String");
		    String text = s.nextLine();

		    if (isUnique(text)) 
		      System.out.println("The characters of String are unique");
		     else 
		      System.out.println("The characters of String are not unique");
			  s.close();
		  }

		  public static boolean isUnique(String text) {
		    Set<Character> set = new HashSet<>();
		    char[] characters = text.toCharArray();
		    for (Character c : characters) {
		      if (!set.add(c)) 
		        return false;
		    }
		    return true;
		  }
}
