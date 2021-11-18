//10. WAP to remove duplicate characters

package Assignment_4;

import java.util.*;

public class Task_10 {
    static String removeDuplicate(char str[], int n)
    {
        int index = 0;
        for (int i = 0; i < n; i++)
        {
            int j;
            for (j = 0; j < i; j++) 
            {
                if (str[i] == str[j])
                    break;
            }
 
            if (j == i) 
                str[index++] = str[i];
        }
        return String.valueOf(Arrays.copyOf(str, index));
    }
  
    public static void main(String[] args)
    {
    	Scanner sc= new Scanner(System.in); 
    	System.out.print("Enter the text to validate: ");
    	String str= sc.nextLine(); 
    	//String[] words = str.split(" ");
        char word[] = str.toCharArray();
        int n = word.length;
        System.out.println(removeDuplicate(word, n));
        sc.close();
    }
}
