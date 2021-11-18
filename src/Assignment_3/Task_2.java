//2.	WAP to Search an Element from an array
package Assignment_3;

import java.util.Scanner;

//import java.util.Scanner;

public class Task_2 {
	public static void main(String[] args) {
		int n,num1;  
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

		Scanner s=new Scanner(System.in);
	    System.out.print("Enter number that you want to find: ");
	    num1 = s.nextInt();
		
        boolean test = false;
        for (int element : array) {
            if (element == num1) {
                test = true;
                break;
            }
        }
        if (test == true)
        	System.out.println("The number " + num1 + " is present in the array");
        else
        	System.out.println("The number " + num1 + " is not present in the array");

        s.close();
        sc.close();

	}
}

