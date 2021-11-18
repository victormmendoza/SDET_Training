//12. WAP to swapping of two strings.Eg: st=”Check”, st1=”code”- o/p : st=code and st1=check

package Assignment_4;

import java.util.Scanner;

public class Task_12 {
    public static void main(String[] input)
    {
        String str1, str2, strtemp;
        Scanner scan = new Scanner(System.in);
        System.out.print("1st String : ");
        str1 = scan.nextLine();
        System.out.print("2nd String : ");
        str2 = scan.nextLine();
        System.out.println("\nStrings before Swapping are :");
        System.out.print("String 1 = " +str1+ "\n");
        System.out.print("String 2 = " +str2+ "\n");
        strtemp = str1;
        str1 = str2;
        str2 = strtemp;
        System.out.println("\nStrings after Swapping are :");
        System.out.print("String 1 = " +str1+ "\n");
        System.out.print("String 2 = " +str2+ "\n");
        scan.close();
    }

}
