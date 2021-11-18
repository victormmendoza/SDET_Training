//WAP to reverse the order of words in a string .He is the one One the is He

package Assignment_4;

import java.util.Scanner;

public class Task_8 {
    public static void main(String[] args) {
    	Scanner sc= new Scanner(System.in); 
    	System.out.print("Enter the text to validate: ");
    	String str= sc.nextLine(); 
    	String[] words = str.split(" ");
    	String reversedString = "";
    	for (int i = words.length - 1; i >= 0; i--)
        {
    		String reverseWord = words[i]; 
            reversedString = reversedString + reverseWord + " ";
    	}
    	System.out.println(str);
    	System.out.println(reversedString);
        sc.close();
    }
}
