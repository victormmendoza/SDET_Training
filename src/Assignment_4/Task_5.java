//5. WAP to remove duplicate spaces from a string?

package Assignment_4;

import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {
    	Scanner s= new Scanner(System.in); 
    	System.out.print("Enter the text to validate: ");
    	String str= s.nextLine(); 
        str = str.replaceAll("\\s+", " ");
        System.out.println(str);
        s.close();

    }
}
