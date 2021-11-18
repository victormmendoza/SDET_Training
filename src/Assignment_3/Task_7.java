//7.	WAP to sort an array using built in method and display the elements using  foreach  loop.
package Assignment_3;

import java.util.Scanner;

public class Task_7 {
	public static void main(String[] args) {
		int n; 
        int temp = 0;    

		Scanner sc=new Scanner(System.in);  
		System.out.print("Enter the number of elements you want to store: ");  
		n=sc.nextInt();  
		int[] array = new int[n];  
		System.out.println("Enter the elements of the array: ");  
		for(int i=0; i<n; i++)  
			array[i]=sc.nextInt();  
		System.out.println("Array elements are: ");    
		for (int i=0; i<n; i++)   
			System.out.println(array[i]);  
		
     for (int i = 0; i <array.length; i++) {     
       for (int j = i+1; j <array.length; j++) {     
           if(array[i] >array[j]) {      //swap elements if not in order
              temp = array[i];    
              array[i] = array[j];    
              array[j] = temp;    
            }     
         }     
     }    

     System.out.println("\nArray sorted in ascending order: ");    
     for (int i = 0; i <array.length; i++)    
         System.out.print(array[i] + " ");    
	sc.close();

	}
}
