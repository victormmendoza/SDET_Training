//3.	WAP to find the largest and smallest  element of and array

package Assignment_3;

import java.util.Arrays;
import java.util.Scanner;

public class Task_3 {
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

		System.out.println("The sorted array is:");
		Arrays.sort(array);
		
		System.out.println("The biggest number is: " + array[n-1]);
		System.out.println("The smallest number is: " + array[0]);
		sc.close();
	}
}
