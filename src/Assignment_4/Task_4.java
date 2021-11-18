//4. WAP to remove all spaces from a string?

package Assignment_4;

import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
    	Scanner s= new Scanner(System.in); 
    	System.out.print("Enter the text to validate: ");
    	String str= s.nextLine(); 
    	System.out.println("The text without spaces is: ");
    	str = str.replaceAll("\\s", "");
        System.out.println(str);
        s.close();
    }
}
