//3. WAP to find duplicates words / characters and their occurrence in a string?

package Assignment_4;

import java.util.Scanner;

public class Task_3 {
	    public static void main(String[] args) {
	    	int count;
	    	Scanner s= new Scanner(System.in); 
	    	System.out.print("Enter one string: ");
	    	String str= s.nextLine();   
	    	String duplicates = "";
	    	String[] words = str.toLowerCase().trim().split(" ");
	    	for (int i = 0; i < words.length; i++) {
	    		count = 1;
	    		for (int j = i + 1; j < words.length; j++) {
	    			if (words[i].equals(words[j]))
	    				count++;
	    		}
	    		if (count > 1) {
	    			if (duplicates.isEmpty()) {
	    				duplicates += " " + words[i] + " : " + count;
	    			} else if (!duplicates.matches("(.*) " + words[i] + " (.*)")) {
	    				duplicates += " " + words[i] + " : " + count;
	    			}
	            }
	        }
	        System.out.println(duplicates);
	        s.close();

	    }
}
