//7. Wap to reverse a string from each word ex. JAVA LANG -- AVAJ GNAL

package Assignment_4;

import java.util.Scanner;

public class Task_7 {
    public static void main(String[] args) {
    	Scanner sc= new Scanner(System.in); 
    	System.out.print("Enter the text to reverse: ");
    	String str= sc.nextLine(); 
    	String[] words = str.split(" ");
    	String reversedString = "";
    	for (int i = 0; i < words.length; i++)
            {
               String word = words[i]; 
               String reverseWord = "";
               for (int j = word.length()-1; j >= 0; j--) 
    	   {
    		reverseWord = reverseWord + word.charAt(j);
    	   }
    	   reversedString = reversedString + reverseWord + " ";
    	}
    	System.out.println("Original Text: " + str);
    	System.out.println("Reverse Text:  " + reversedString);
        sc.close();
    }
}
