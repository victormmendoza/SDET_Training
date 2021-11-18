//4.	WAP to find the index number of largest element

package Assignment_3;

import java.util.Scanner;

public class Task_4 {
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
			System.out.println("["+ i + "]: " + array[i]);
		
		  if ( array == null || array.length == 0 ) 
				System.out.println("Enter a valid array");  

		  int largest = 0;
		  for ( int i = 1; i < array.length; i++ )
		  {
		      if ( array[i] > array[largest] ) largest = i;
		  }
		  System.out.println("The index for the largest number is: " + largest);
		  sc.close();

	}	
}
