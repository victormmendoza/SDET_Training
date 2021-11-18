/*Create a class BankAtm with following properties and methods
Properties:
	atmId;
	bankName;
	location;
	balance
Methods:
	withdraw(double amt)
	deposit(double amt)
The withdraw method should check the available balance in the ATM before deducing the amount from the balance. If the balance is less than 10000 the withdrawal should not be allowed and a user defined exception BankATMException should be thrown. The withdrawal should also not be allowed if the amount to be withdrawn is greater than balance.
Create a user defined exception class BankATMException class that will be created whenever withdrawal is done for balance less than 10000.
Create an application Bank having 3 BankAtm objects. Every time withdraw method is called on the BankAtm object the balance should be subtracted.
 */


package bank;

import java.util.*;

public class BankAtm {
	int atmid, bankName, location, balance;
	Scanner s=new Scanner(System.in);
	public void input() {
		System.out.println("Enter the Atm Id:");
		atmid=s.nextInt();
		System.out.println("Enter the Bank Name:");
		bankName=s.nextInt();
		System.out.println("Enter the Location:");
		location=s.nextInt();
		System.out.println("Enter the Balance:");
		balance=s.nextInt();
	}
	public void withdraw(double amt) {
		int money;
		try {
			System.out.println("Enter the Atm Id:");
			money=s.nextInt();
		}
	}
	public void deposit(double amt) {
		
	}
}
