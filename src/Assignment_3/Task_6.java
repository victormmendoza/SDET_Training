//6.	WAP to find the second largest number  of an array.

package Assignment_3;

import java.util.Arrays;
import java.util.Scanner;

public class Task_6 {
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
		
		Arrays.sort(array);
		System.out.println("The 2nd biggest number is: " + array[n-2]);
		sc.close();
	}
}
