//10.	WAP to copy an array elements into new array and print the new array values
package Assignment_3;

import java.util.Scanner;

public class Task_10 {
	public static void main(String[] args) {
		int n,n1;  
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

		System.out.print("Enter the number of elements you want to store: ");  
		n1=sc.nextInt();  
		int[] array1 = new int[n1];  
		System.out.println("Enter the elements of the array: ");  
		for(int i=0; i<n1; i++)  
			array1[i]=sc.nextInt();  
		System.out.println("Array elements are: ");    
		for (int i=0; i<n1; i++)   
			System.out.println(array1[i]);  
		
	    for (int i = 0; i < array1.length; i++) {     
	    	array[i] = array1[i];     
	    }      
	        
	    System.out.println("Elements of new array: ");    
	    for (int i = 0; i < array.length; i++)    
	       System.out.print(array[i] + " ");    
		sc.close();  
	}
}
