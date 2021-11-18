//11. WAP to sort string in alphabetical order. Eg: Computer cemoprtu

package Assignment_4;

import java.util.Arrays;
import java.util.Scanner;

public class Task_11 {
    public static void main(String[] args) {
    	Scanner s= new Scanner(System.in); 
    	System.out.print("Enter the text to validate: ");
    	String str= s.nextLine();
        str = str.toLowerCase();    
        char charArray[] = str.toCharArray();
        Arrays.sort(charArray);
        System.out.println(new String(charArray));
        s.close();

    }
}
