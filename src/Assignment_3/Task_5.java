//5.	WAP to remove the element on specific index number form an array

package Assignment_3;

import java.util.Scanner;

public class Task_5 {
	public static void main(String[] args) {
		int n,num;  
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

		System.out.print("Enter the index of the element that you want to remove: ");  
		num=sc.nextInt();  
		for (int i=0; i<n; i++) {   
			if (i == num)
				i++;
			System.out.println("["+ i + "]: " + array[i]);
		}
		sc.close();

	}
}
