//8.	WAP to find the sum of an array elements
package Assignment_3;

import java.util.Scanner;

public class Task_8 {
	public static void main(String[] args) {
		int n;  
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
        int sum = 0;  
        for (int i = 0; i < array.length; i++) 
           sum = sum + array[i];  
        
        System.out.println("Sum of all the elements of an array: " + sum);  	
		sc.close();

	}
}
