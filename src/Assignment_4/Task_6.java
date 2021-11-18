//6. WAP to sort string in java without API?

package Assignment_4;

import java.util.*;

public class Task_6 {
    public static void main(String[] args) {
    	Scanner s= new Scanner(System.in); 
    	System.out.print("Enter the text to validate: ");
    	String str= s.nextLine(); 
        char charArray[] = str.toCharArray();
        Arrays.sort(charArray);
        System.out.println(new String(charArray));
        s.close();

    }
}
